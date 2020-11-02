package ExFromSobes;

public class One {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 21, 5, 7};
        System.out.println(getAverage(arr));
    }

    public static int getAverage(int[] nums){
        int lenght = nums.length;
        int sum = 0;
        for (int i = 0; i < lenght; i++) {
            sum = sum + nums[i];
        }
        return sum / lenght;
    }
}
