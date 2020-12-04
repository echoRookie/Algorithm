import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class FindRelativeRanks {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        String[] res = findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        for (String str : res) {
            stringJoiner.add(str);
        }
        System.out.println(stringJoiner.toString());
    }

    public static String[] findRelativeRanks(int[] nums) {
        int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        String[] res = new String[nums.length];
        Arrays.sort(temp);
        for (int i = temp.length - 1; i >= 0; i--) {
            int j = map.get(temp[i]);
            if (i == temp.length - 1) {
                res[j] = "Gold Medal";
            } else if (i == temp.length - 2) {
                res[j] = "Silver Medal";
            } else if (i == temp.length - 3) {
                res[j] = "Bronze Medal";
            } else {
                res[j] = String.valueOf(nums.length - i);
            }
        }
        return res;
    }
}
