import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup {
    public static void main(String[] args) {
        SubsetsWithDup subsetsWithDup = new SubsetsWithDup();
        List<List<Integer>> result = subsetsWithDup.subsetsWithDup(new int[]{1,2, 2});
          for (List<Integer> a : result
             ) {
            String string = "";
            for (Integer str: a
                 ) {
                string = str  + string + " ";
            }
            System.out.println(string);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> trace = new ArrayList<>();
        Arrays.sort(nums);
        backtrace(nums, trace, result, 0);
        return  result;
    }
    public void backtrace(int[] nums, List<Integer> trace, List<List<Integer>> result, int start){
        result.add(new ArrayList<>(trace));
        for(int i = start; i < nums.length; i++){
            if(( i - 1 >= start) && nums[i] == nums[i - 1]){
                continue;
            }
            else{
                trace.add(nums[i]);
            }


            backtrace(nums, trace, result, i + 1);
            trace.remove(trace.size() - 1);
        }
    }
}
