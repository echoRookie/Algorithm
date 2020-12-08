import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
    public static String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
        int[] nums = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuffer stringBuffer = new StringBuffer();
        search(nums, num, stringBuffer, map);
        return stringBuffer.toString();
    }

    public static boolean search(int[] nums, int num, StringBuffer stringBuffer, Map<Integer, String> map) {
        if (num == 0) {
            return true;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (num - nums[i] >= 0) {
                stringBuffer.append(map.get(nums[i]));
                if (search(nums, num - nums[i], stringBuffer, map)) {
                    return true;
                }
            }
        }
        return false;
    }
}
