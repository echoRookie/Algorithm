import java.util.ArrayList;
import java.util.List;

public class Permute {
    public static void main(String[] args) {
        permute(new int[]{1, 2, 3});
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(nums, list, result);
      /*  for (List<Integer> a : result
             ) {
            String string = "";
            for (Integer str: a
                 ) {
                string = str  + string + " ";
            }
            System.out.println(string);
        }*/
        return result;
    }
    public static void backtrack(int nums[], List<Integer> list, List<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i= 0; i < nums.length; i++){
            if(list.contains(nums[i]))
                continue;
            else
                list.add(nums[i]);
            backtrack(nums, list, result);
            list.remove(list.size() -1);
        }

    }
}
