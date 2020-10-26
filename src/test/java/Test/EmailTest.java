package Test;

import PageObject.MailRu.AutorizationPage;
import Test.Selenoid.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class EmailTest extends Base {
    String url = "https://mail.ru/";
    String login = "antikiller_23@list.ru";
    String subj1;
    String subj2;
    String text = "Привет Уроды!";
    String newSign = LocalDateTime.now().toString();


    @Test
    public void test(){
        getDriver().get(url);
        AutorizationPage ap = new AutorizationPage(getDriver());
        Assert.assertTrue(ap.login(login, "xxxlll23"));
        subj1 = LocalDateTime.now().toString();
        ap.sendMassege(subj1,text);
        Assert.assertTrue(ap.checkMail(subj1, text));
        subj2 = LocalDateTime.now().toString();
        Assert.assertTrue(ap.changePodpis(newSign, login, subj2));
        Assert.assertTrue(ap.checkDeleteMail(subj1, subj2));
    }

}
