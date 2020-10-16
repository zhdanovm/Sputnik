package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test13102 {
    private Object b;

    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }

    @Test(dataProvider = "SetEnvironment")

     public void zz(String a, String c){
        System.out.println(a+c);
    }
}
