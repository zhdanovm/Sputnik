package PageObject;

import SeleniumBase.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitPage extends Base {
    public UnitPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = ".//input[@title='Поиск']")
    private WebElement setSearchText;
    @FindBy(xpath = "(.//input[@value='Поиск в Google'])[1]")
    private WebElement submitSearch;
    /**
     * Вводим текст в поисковую строку.
     *
     * @param text
     */
    public void setSearchText(String text) {
        setText(setSearchText, text);
    }

    /**
     * Кликаем по кнопке Поиск в гугле.
     */
    public void clickSubmitSearch(){
        click(submitSearch);
    }
}

