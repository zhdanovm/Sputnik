package PageObject.MailRu;

import SeleniumBase.Base;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutorizationPage extends Base {

    public AutorizationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginField;


    @FindBy(xpath = "//input[@name = 'password']")
    private WebElement passField;

    @FindBy(xpath = "//input[@value='Ввести пароль']")
    private WebElement buttonPass;



//    @FindBy(xpath = "//iframe")
//    private WebElement frame;


    @Step("Входим в почту")
    public Boolean login(String login, String pass){
       waitVisibilityOfElement(loginField);
       setText(loginField, login);
       click(buttonPass);
       waitVisibilityOfElement(passField);
       setText(passField,pass);
       click(buttonPass);
//       return waitVisibilityOfElement(buttonNewMail);
        return true;

    }

}
