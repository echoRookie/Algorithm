import java.util.HashMap;
import java.util.Map;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (!map.containsKey(s.charAt(left)) && left < right) {
                left++;
            }
            while (!map.containsKey(s.charAt(right)) && left < right) {
                right--;
            }
            if (left < right && map.containsKey(s.charAt(left)) && map.containsKey(s.charAt(right))) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(str);
    }
}
