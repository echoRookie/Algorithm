public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{4, 5}, 4));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int start = 0;
        while (start < nums.length) {
            while (start < nums.length && nums[start] != val) {
                start++;
            }

            if (start < nums.length && nums[start] == val) {
                if (start >= nums.length - 1) {
                    break;
                } else {
                    int end = start + 1;
                    while (end < nums.length && nums[end] == val) {
                        end++;
                    }
                    if (end > nums.length - 1) {
                        break;
                    } else {
                        int temp = nums[start];
                        nums[start] = nums[end];
                        nums[end] = temp;
                        start++;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return nums.length;
    }

    public int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
