package Basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BadeTest {
    @BeforeTest
    public void  beforet(){
        System.out.println("start test");
    }
    @AfterTest
    public void aftert() {
        System.out.println("finish test");
    }
    @BeforeMethod
    public void beform ()
    {
        System.out.println("Start method");
    }
    @AfterMethod
    public void afterm ()
    {
        System.out.println("finish method");
    }
}
