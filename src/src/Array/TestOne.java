package Array;

public class TestOne {
    public static int removeDuplicates(int[] nums) {
        int i;
        int k = 1;
        int length = nums.length;
        int j;
        int temp;
        if (length <= 1) {
            return length;
        } else {
            for (i = 1; i < length; i++) {
                for (j = i; j < length; j++) {
                    if (nums[j] > nums[i - 1] && nums[j] > nums[k - 1]) {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        k += 1;
                        break;
                    }
                }
            }
            return k;
        }
    }
}
