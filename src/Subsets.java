/*  78
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

        说明：解集不能包含重复的子集。

        示例:

        输入: nums = [1,2,3]
        输出:
        [
        [3],
          [1],
          [2],
          [1,2,3],
          [1,3],
          [2,3],
          [1,2],
          []
        ]
*/


import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        List<List<Integer>> result = subsets.subsets(new int[]{1,2,3});
        for (List<Integer> a : result
        ) {
            String string = "";
            for (Integer str : a
            ) {
                string = str + string + "  ";
            }
            System.out.println(string);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         backtrace(nums, list, result, 0);
         return result;
    }
    public  void backtrace(int[] nums, List<Integer> list, List<List<Integer>> result, int start){
        result.add(new ArrayList<>(list));
        for(int i= start; i < nums.length; i++){
            list.add(nums[i]);
            backtrace(nums, list, result, i + 1);
            list.remove(list.size() -1);
        }
    }
}
