import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
    public static int firstUniqChar(String s) {
        //初始化26个字母，默认出现的次数为0
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ++nums[s.charAt(i) - 97];
        }
        // 判断是否存在只重复一次的
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return -1;
        } else {
            int index = -1;
            for (int i = 0; i < s.length(); i++) {
                if (nums[s.charAt(i) - 97] == 1) {
                    index = i;
                    break;
                }
            }
            return index;
        }
    }
}
