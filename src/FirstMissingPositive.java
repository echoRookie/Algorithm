import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{0, 2, 2, 1, 1}));
    }
    public static int firstMissingPositive(int[] nums) {
        // 找出数组中大于0的最小整数
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 0){
                continue;
            }
            else {
                if(nums[i] < min){
                    min = nums[i];
                }
            }
        }
        if(min > 1){
            return 1;
        }
        else{
            Arrays.sort(nums);
            min = 1;
            int index = 0;
            while(index < nums.length){
                if (nums[index] <= 0){
                    index ++;
                    continue;
                }
                if(nums[index] == min){
                    while (index < nums.length - 1){
                        if(nums[index + 1] == min){
                            index ++;
                            continue;
                        }
                        if(nums[index + 1]  == min + 1 ){
                            ++min;
                            ++index;
                            continue;
                        }

                        else {
                            break;
                        }
                    }
                    break;
                }
            }
            return ++min;
        }
    }
}
