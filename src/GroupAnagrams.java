import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> res = groupAnagrams(new String[]{"eat"});
        for (List<String> list: res) {
            StringJoiner stringJoiner = new StringJoiner(" ");
            for (String str: list) {
                stringJoiner.add(str);
            }
            System.out.println(stringJoiner.toString());
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return res;
        }
        List<String> stringList = new ArrayList<>();
        for (String str : strs) {
            stringList.add(str);
        }
        while (stringList.size() > 0) {
            // 每次循环将第一个作为结果放入结果集
            List<String> list = new ArrayList<>();
            list.add(stringList.get(0));
            stringList.remove(0);
            // 查找剩余和他一样的放入结果集
            if (stringList.size() > 0) {

                for (int i = 0; i < stringList.size(); i++) {
                    if (isAnagram(list.get(0), stringList.get(i))) {
                        list.add(stringList.get(i));
                        stringList.set(i, "0");
                    }
                }
                List<String> temp = new ArrayList<>();
                for (String str : stringList) {
                    if (str != "0") {
                        temp.add(str);
                    }
                }
                stringList = temp;
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ++nums[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < t.length(); i++) {
            --nums[t.charAt(i) - 'a'];
            if (nums[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
