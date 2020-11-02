package ExFromSobes;

public class Three {
    public static void main(String[] args) {
        String str = "19 -3 42 -89 15 75";
        System.out.println(getMaxAndMin(str));
    }

    public static String getMaxAndMin(String numbers) {
        String[] arr = numbers.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i]) < min) {
                min = Integer.valueOf(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i]) > max) {
                max = Integer.valueOf(arr[i]);
            }
        }

        return max + " " + min;
    }
}
