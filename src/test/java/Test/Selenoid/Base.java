package Test.Selenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.Driver;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Base {
    public WebDriver driver;
    protected String ggrUrl = "http://192.168.1.92:4445";

    @BeforeTest
    public void beforeT() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("latest");

        try {
            driver = new RemoteWebDriver(
                    URI.create ("http://192.168.1.92:4445/wd/hub").toURL(),
                    capabilities
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();

        System.out.println("Дейсивие перед тестом");
    }
    @AfterTest
    public void afterT() {
        driver.quit();
        if (driver != null) {
            driver.quit();
        }

        System.out.println("Действие после теста");

    };

    public WebDriver getDriver() {
        return driver;
    }
}
