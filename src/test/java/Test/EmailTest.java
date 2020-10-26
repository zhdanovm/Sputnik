package Test;

import PageObject.MailRu.AutorizationPage;
import Test.Selenoid.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class EmailTest extends Base {
    String url = "https://mail.ru/";
    String login = "antikiller_23@list.ru";
    String subj;
    String text = "Привет Уроды!";
    String newSign = LocalDateTime.now().toString();


    @Test
    public void test(){
        driver.get(url);
        AutorizationPage ap = new AutorizationPage(getDriver());
        Assert.assertTrue(ap.login(login, "xxxlll23"));
          subj = LocalDateTime.now().toString();
        Assert.assertTrue(ap.sendMassege(subj,text));
        Assert.assertTrue(ap.checkMail(subj, text));
            subj = LocalDateTime.now().toString();
        ap.changePodpis(newSign, login, subj);

    }

}
