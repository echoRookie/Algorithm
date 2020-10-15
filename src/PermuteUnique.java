import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique {
    public static void main(String[] args) {
        PermuteUnique permuteUnique = new PermuteUnique();
        List<List<Integer>> result = permuteUnique.permuteUnique(new int[]{1, 1, 2});
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
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       List<Integer> trace = new ArrayList<>();
        Arrays.sort(nums);
       backtrace(nums, result, trace, nums.length);
       return result;
    }
    public void backtrace(int nums[], List<List<Integer>> result, List<Integer> trace, int length){
       if(trace.size() == length){
           result.add(new ArrayList<>(trace));
           return;
       }
       for(int i = 0; i < nums.length; i++){
           if(i-1 >= 0 && nums[i] == nums[i -1])
               continue;
           else
               trace.add(nums[i]);
           int[] newNums = removeOfIndex(nums, i);
           backtrace(newNums, result, trace, length);
           trace.remove(trace.size() -1);
       }
    }
    public int[] removeOfIndex(int[] nums, int index){
        int newNums[] = new int[nums.length -1];
        for(int i = 0; i < newNums.length; i++){
            if(i < index)
                newNums[i] = nums[i];
            if(i >= index)
                newNums[i] = nums[i + 1];
        }
        return newNums;
    }
}
