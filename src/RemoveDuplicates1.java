public class RemoveDuplicates1 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int j = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                count = 1;
            } else (nums[i] == nums[j] && count <= 1) {
                j++;
                nums[j] = nums[i];
                count++;
            }
        }
        return j + 1;
    }
}
