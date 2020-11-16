import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int num : nums) {
            if(num > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }
            else if(firstMax == num){
                continue;
            }
            else if(num > secondMax && num < firstMax){
                thirdMax = secondMax;
                secondMax = num;
            }
            else if(secondMax == num){
                continue;
            }
            else if(num > thirdMax && num < secondMax){
                thirdMax = num;
            }
            else {
                continue;
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            return (int)firstMax;
        }
        else
            return (int)thirdMax;
    }
}
