package PageObject.MailRu;

import SeleniumBase.Base;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMailPage extends Base {

    public SendMailPage(WebDriver driver) { super(driver);}


    @FindBy(xpath = "//a[@title=\"Написать письмо\"]")
    private WebElement buttonNewMail ;


    @FindBy(xpath = "//div[@data-name=\"to\"]//input")
    private WebElement fieldTo;


    @FindBy(xpath = "//input[@name=\"Subject\"]")
    private WebElement fieldSubj;

    @FindBy(xpath = "//div[@role=\"textbox\"]")
    private WebElement fieldBody;

    @FindBy(xpath = "//span[@title=\"Отправить\"]")
    private WebElement buttonSend;

    @FindBy(xpath = "//a[.='Письмо отправлено']")
    private WebElement titleSend;

    @FindBy(xpath = "//div[.='Входящие'][1]")
    private WebElement buttonIN;

    @FindBy(xpath = "//span[@title=\"Закрыть\"]")
    private WebElement krest;

    @FindBy(xpath = "//h2 [@class=\"thread__subject\"]")
    private WebElement subjInbox;

    @FindBy(xpath = "//div[@class=\"letter__body\"]")
    private WebElement bodyInbox;


    @Step("Отправляем письмо с исходными параметрами")
    public void sendMassege(String  jopa, String text){
        String to = "antikiller_23@list.ru";
        click(buttonNewMail);
        waitVisibilityOfElement(fieldTo);
        setText(fieldTo, to);
        sleep(2000);
        click(fieldSubj);
        setText(fieldSubj, jopa);
        sleep(2000);
        setText(fieldBody, text);
        sleep(2000);
        click(buttonSend);
        sleep(2000);
        click(krest);

    }

    @Step("Проверяем письмо с темой во входящих")
    public boolean checkMail(String subj, String text){
        click(buttonIN);
        getDriver().findElement(By.xpath("//span[contains (.,\"" + subj + "\")][1]")).click();
        sleep(10000);
        String subjIn = getText(subjInbox);
        String textIn = getText(bodyInbox);

        return subjIn.equals(subj) && textIn.contains(text);
    }
}
