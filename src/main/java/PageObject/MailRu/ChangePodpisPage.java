package PageObject.MailRu;

import SeleniumBase.Base;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePodpisPage extends Base {
    public ChangePodpisPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@data-test-id=\"page-card-signature\"]")
    private WebElement nameAndSign;

    @FindBy(xpath = "//button[@data-test-id=\"edit\"]")
    private WebElement buttonEdit;

    @FindBy(xpath = "//div[@data-test-id='editor']/div/div[contains(@class, 'editable-container')]/div[@contenteditable=\"true\"]")
    private WebElement signEditor;

    @FindBy(xpath = "//button[@data-test-id=\"save\" and @type=\"submit\"]")
    private WebElement buttonSave;

    @FindBy(xpath = "//button[@data-test-id=\"to-inbox\"]")
    private WebElement buttonToBox;

    @FindBy(xpath = "//div[contains(@class, 'editor_container')]")
    private WebElement editorMail;

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

    @FindBy(xpath = "//span[@title=\"Закрыть\"]")
    private WebElement krest;

    @FindBy(xpath = "//div[.='Входящие'][1]")
    private WebElement buttonIN;

    @FindBy(xpath = "//span[@title=\"Вернуться\"]")
    private WebElement buttonBack;

    @FindBy(xpath = "//h2 [@class=\"thread__subject\"]")
    private WebElement subjInbox;

    @FindBy(xpath = "//div[@class=\"letter__body\"]")
    private WebElement bodyInbox;


    @Step("Изменяем подпись и проверяем")
    public Boolean changePodpis(String newSign, String to, String subj) {
        sleep(3000);
        getDriver().get("https://e.mail.ru/settings");
        click(nameAndSign);
        sleep(3000);
        click(buttonEdit);
        sleep(3000);
        click(signEditor);
        setText(signEditor, newSign);
        click(buttonSave);
        sleep(2000);
        click(buttonToBox);
        sleep(2000);
        click(buttonNewMail);
        sleep(3000);
        String editorText = getText(editorMail);
        boolean check1 = editorText.contains(newSign);
        setText(fieldTo, to);
        click(fieldTo);
        sleep(3000);
        setText(fieldSubj, subj);
        setText(fieldBody, "666");
        click(buttonSend);
        sleep(3000);
        click(krest);
        sleep(1000);
        click(buttonIN);
        sleep(3000);
        getDriver().findElement(By.xpath("//span[contains (.,\"" + subj + "\")][1]")).click();
        sleep(3000);
        boolean check2 = getText(subjInbox).contains(subj);
        boolean check3 = getText(bodyInbox).contains(newSign);
        click(buttonBack);
        sleep(3000);
        return check1 && check2 && check3;

    }

}
