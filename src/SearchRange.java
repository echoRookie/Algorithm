public class SearchRange {
    public static void main(String[] args) {
        int [] res = searchRange(new int[]{1}, 1);
        for (Integer param: res) {
            System.out.println(param);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int res[] = new int[]{-1, -1};
        if(nums == null || nums.length <= 0){
            return res;
        }
        int left = 0;
        int right = nums.length -1;
        int temp = -1;
        while (left <= right ){
            int mid = left + (right -left)/2;
            if(nums[mid] == target){
                temp = mid;
                break;
            }
            else if(nums[mid] > target){
                right = mid -1;
            }
            else {
                left = mid +1;
            }
        }
        if(temp != -1){
            left = temp;
            right = temp;
            while ( left>=0 && nums[left] == target){
                left --;
            }
            res[0] = left +1;
            while (right <= nums.length -1 && nums[right] == target){
                right ++;
            }
            res[1] = right - 1;
        }
        return res;
    }
}
