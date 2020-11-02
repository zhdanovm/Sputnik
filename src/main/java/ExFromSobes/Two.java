package ExFromSobes;

public class Two {
    public static void main(String[] args) {
        int[] arr = new int[]{-10, 3, 56, 45, 70};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int [] nums){
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= num) {
                num = nums[i];
                continue;
            }
            return false;
        }
        return true;
    }
}
