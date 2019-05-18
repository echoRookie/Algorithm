import java.util.Arrays;
import java.util.List;

class Solution {
   public int maxSubArray(int[] nums) {
        int maxSum = nums[0];                      //maxSum为最终结果
        int curSum = 0;                            //curSum为动态和数
        for (int i = 0; i < nums.length; i++) {
            if (curSum < 0) {  
//curSum<0，那么curSum没有利用价值了，直接至0；curSum>0，之后才有可能加出更大的和
                curSum = 0;
            }
            curSum += nums[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}