import java.util.Arrays;

public class CheckPossibility {
    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{1,5,4,6,7,10,8,9}));
    }
    public static boolean checkPossibility(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                nums[i + 1] = nums[i];
                count++;
            }
        }
        int count1 = 0;
        for (int i = numsCopy.length - 1; i > 0; i--) {
            if (numsCopy[i] < numsCopy[i - 1]) {
                numsCopy[i - 1] = numsCopy[i];
                count1++;
            }
        }
        return count <= 1 || count1 <= 1 ? true : false;
    }

}
