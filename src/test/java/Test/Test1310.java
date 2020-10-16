package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test1310 {
    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void zz(String a, String b){
        System.out.println(a+b);
    }


}
