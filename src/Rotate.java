public class Rotate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        for (Integer num : nums) {
            System.out.println(num + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int removeCount = k % length;
        for (int i = 0; i < removeCount; i++) {
            int temp = nums[length - 1];
            for (int j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}
