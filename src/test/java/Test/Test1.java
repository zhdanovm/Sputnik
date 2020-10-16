package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Test1 {
    public int a = 23;
    private int b = 1;
    protected int c = 3;
    String g = "11";

    public static void main(String[] args) {
        HashMap <String, Integer> aa = new HashMap<String, Integer>();
        aa.put("q", 33);
        aa.put ("w", 44);
        aa.put("e",55);
        for (String x:
             aa.keySet()) {
            System.out.println(aa.get(x));
            
        }
        ArrayList<String> ab = new
                ArrayList<String>();

        ab.add("perekur");
        ab.add("NPR");
        for (String ui:ab) {
            System.out.println(ui);
        }
        System.out.println("Hi men");
        if(1<3){
            System.out.println("1111111");
            for (int i = 0; i < 10; i++){
                System.out.println(i);
                if (i>=7) {
                    System.out.println("limit");
                }
                while (i==8); System.out.println("off");
                break;
            }

        }
    }

    // Добавлена эта строка
    public int getA() {
        return a;
    }
}
