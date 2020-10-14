import java.util.Arrays;

public class Rob {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 2, 3, 1, 7}));
    }

    public static int rob(int[] nums) {
        // 不考虑边界的dp结果
        int dp[] = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        // 考虑边界的dp结果
        int dp1[] = new int[nums.length + 1];
        dp1[0] = 0;
        dp1[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            // 计算不考虑边界的dp
            int sum1 = dp[i - 1];
            int sum2 = nums[i - 1] + dp[i - 2];
            dp[i] = Math.max(sum1, sum2);
            // 考虑边界两种情况
            int rst1 = dp[i - 1];
            int rst2 = nums[i - 1];
            int start = 1;
            int end = i - 3;
            if (end >= start) {
                int[] copy = Arrays.copyOfRange(nums, start, end + 1);
                int dp2[] = new int[nums.length + 1];
                dp2[0] = 0;
                dp2[1] = copy[0];
                for (int j = 2; j <= copy.length; j++) {
                    int sumcopy1 = dp2[j - 1];
                    int sumcopy2 = copy[j - 1] + dp2[j - 2];
                    dp2[j] = Math.max(sumcopy1, sumcopy2);
                }
                rst2 = nums[i - 1] + dp2[copy.length];
            }
            dp1[i] = Math.max(rst1, rst2);

        }
        return dp1[nums.length];
    }
}
