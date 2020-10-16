package Basetest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Badetest1 extends BadeTest
{
    int b = 11;


    @Test
   public void qq()
    {
        Assertion a = new Assertion();
        boolean result = b == 11;
        a.assertTrue(result);
        System.out.println(result);

}
}
