import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args) {
        //s = "abpcplea", d = ["ale","apple","monkey","plea"]
        List<String> list = new ArrayList<>();
        list.add("ale");
        list.add("apple");
        list.add("monkey");
        list.add("plea");
        System.out.println(findLongestWord("abpcplea", list));
    }

    public static String findLongestWord(String s, List<String> d) {
        String[] strings = new String[d.size()];
        String res = "";
        for (int i = 0; i < d.size(); i++) {
            strings[i] = isSubsequence(d.get(i), s);
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > res.length()) {
                res = strings[i];
            }
        }
        return res;
    }

    public static String isSubsequence(String subStr, String str) {
        int subIndex = 0;
        int index = 0;
        while (subIndex < subStr.length() && index < str.length()) {
            if (subStr.charAt(subIndex) == str.charAt(index)) {
                ++subIndex;
                ++index;
            } else {
                ++index;
            }
        }
        if (subIndex < subStr.length()) {
            return "";
        } else {
            return subStr;
        }
    }
}
