/*给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

        candidates 中的每个数字在每个组合中只能使用一次。

        说明：

        所有数字（包括目标数）都是正整数。
        解集不能包含重复的组合。 
        示例 1:

        输入: candidates = [10,1,2,7,6,1,5], target = 8,
        所求解集为:
        [
        [1, 7],
        [1, 2, 5],
        [2, 6],
        [1, 1, 6]
        ]
        示例 2:

        输入: candidates = [2,5,2,1,2], target = 5,
        所求解集为:
        [
          [1,2,2],
          [5]
        ]*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
   static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        combinationSum2(new int[]{2,5,2,1,2}, 5);
            for (List<Integer> a : result
             ) {
            String string = "";
            for (Integer str: a
                 ) {
                string = str  + string + "  ";
            }
            System.out.println(string);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrace(list, candidates, target, 0 , 0);
        return  result;
    }
    public static  void backtrace( List<Integer> list, int []candidates, int target, int sum, int index){
         if(sum > target)
             return;
         if(sum == target){
             result.add(new ArrayList<>(list));
             return;
         }
         for(int i = index; i < candidates.length; i++){
             if( i-1>= index && candidates[i] == candidates[i-1])
                 continue;
             sum += candidates[i];
             list.add(candidates[i]);
             backtrace(list, candidates, target, sum, i + 1);
             sum -= candidates[i];
             list.remove(list.size() -1);
         }
    }
}
