public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length <= 0){
            return 0;
        }
        int start = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(i - start - 1> max){
                    max = i - start -1;
                }
                start = i;
            }
            if(nums[i] == 1 && i == nums.length - 1){
                if(i - start  > max){
                    max = i - start;
                }
            }
        }
        return max;
    }
}
