public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
      int dp[] = new int[nums.length + 1];
      dp[0] = 0;
      dp[1] = nums[0];
      for(int i = 2; i<= nums.length; i++){
          dp[i] = Math.max(dp[i-1] + nums[i-1], nums[i -1]);
          System.out.println(dp[i]);
      }
      int max = dp[0];
      for (int i = 1; i < dp.length; i++){
          if(dp[i] > max)
              max = dp[i];
      }

      return max;
    }
}
