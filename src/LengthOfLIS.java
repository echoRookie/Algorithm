import java.util.Arrays;

public class LengthOfLIS {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{1,2}));
    }
    public static int lengthOfLIS(int[] nums) {
        if (nums.length <= 0)
            return 0;
        if (nums.length == 1)
            return 1;
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }


        }
        int max = 1;
        for (int a : dp
        ) {
            if (a > max)
                max = a;
        }
        return max;
    }
}
