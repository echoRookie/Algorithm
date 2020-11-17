import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            array[nums[i] - 1] ++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(array[i] == 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}
