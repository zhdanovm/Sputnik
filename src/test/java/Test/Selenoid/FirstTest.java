package Test.Selenoid;

import PageObject.UnitPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class FirstTest extends Base {
    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")
@Test
    public void startTest() {
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        UnitPage in = new UnitPage(getDriver());
        UnitPage sea = new UnitPage(getDriver());

        in.setSearchText("Привет");
        in.clickSubmitSearch();
    }
}