package PageObject.MailRu;

import SeleniumBase.Base;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteMailPage extends Base {
    public DeleteMailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[.='Входящие'][1]")
    private WebElement buttonIN;

    @FindBy(xpath = "//span[@title=\"Удалить\"]")
    private WebElement deleteButton;


    @Step("Удаляем письма")
    public Boolean checkDeleteMail(String subj1, String subj2) {
        click(buttonIN);
        sleep(3000);
        WebElement mesaage1 = getDriver().findElement(By.xpath("//a[contains(.,'" + subj1 +"')]//button[1]"));
        WebElement mesaage2 = getDriver().findElement(By.xpath("//a[contains(.,'" + subj2 +"')]//button[1]"));
        mesaage1.click();
        mesaage2.click();
        click(deleteButton);
        Boolean check1 = waitNotVisibilityOfElement(mesaage1);
        Boolean check2 = waitNotVisibilityOfElement(mesaage2);

        return check1 && check2;
    }





}
