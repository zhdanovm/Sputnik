package Test.Selenoid;

import PageObject.UnitPage;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class FirstTest extends Base {
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