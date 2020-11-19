import java.util.Arrays;

public class MinMoves {
    public static void main(String[] args) {
        System.out.println(minMoves2(new int[]{1,8,9}));
    }

    // 超时
    public static int minMoves(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        while (!isSame(nums)) {
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] += 1;
            }
            count++;
            Arrays.sort(nums);
        }
        return count;
    }

    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i] - nums[0];
        }
        return sum;
    }

    public static boolean isSame(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
