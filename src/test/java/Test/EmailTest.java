package Test;

import PageObject.MailRu.AutorizationPage;
import PageObject.MailRu.ChangePodpisPage;
import PageObject.MailRu.DeleteMailPage;
import PageObject.MailRu.SendMailPage;
import Test.Selenoid.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class EmailTest extends Base {
    String url = "https://mail.ru/";
    String login = "antikiller_23@list.ru";
    String subj1;
    String subj2;
    String text = "Привет Ребята!";
    String newSign = LocalDateTime.now().toString();


    @Test
    public void test(){
        getDriver().get(url);
        AutorizationPage ap = new AutorizationPage(getDriver());
        SendMailPage sm = new SendMailPage(getDriver());
        ChangePodpisPage cp = new ChangePodpisPage(getDriver());
        DeleteMailPage dm = new DeleteMailPage(getDriver());
        Assert.assertTrue(ap.login(login, "xxxlll23"));
        subj1 = LocalDateTime.now().toString();
        sm.sendMassege(subj1,text);
        Assert.assertTrue(sm.checkMail(subj1, text));
        subj2 = LocalDateTime.now().toString();
        Assert.assertTrue(cp.changePodpis(newSign, login, subj2));
        Assert.assertTrue(dm.checkDeleteMail(subj1, subj2));
    }

}
