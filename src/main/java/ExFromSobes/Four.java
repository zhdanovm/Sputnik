package ExFromSobes;

import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1};
        System.out.println(TransformBinaryToInt(arr));
    }

    public static int TransformBinaryToInt(int[] bin) {

        String str = Arrays.toString(bin)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replace(" ", "");

        return Integer.parseInt(str, 2);
    }
}
