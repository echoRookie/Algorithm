import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumProduct {
    public static void main(String[] args) {
        System.out.println(maximumProduct1(new int[]{1,2,3,4}));
    }
    public static int maximumProduct(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrace(nums, list, res);
        List<Integer> firstList =  res.get(0);
        int max = firstList.get(0) * firstList.get(1) * firstList.get(2);
        for (List<Integer> trace: res) {
            if(max < trace.get(0) * trace.get(1) * trace.get(2)){
                max = trace.get(0) * trace.get(1) * trace.get(2);
            }
        }
        return max;
    }
    public static void backTrace(int[] nums, List<Integer> list, List<List<Integer>> res){
        if(list.size() == 3){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            list.add(nums[i]);
            backTrace(Arrays.copyOfRange(nums, i + 1, nums.length), list, res);
            list.remove(list.size() - 1);
        }
    }
    public static int maximumProduct1(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[0] * nums[1] * nums[nums.length - 1]);
    }
}
