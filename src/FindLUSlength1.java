import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLUSlength1 {
    public static void main(String[] args) {

        System.out.println(findLUSlength1(new String[]{"aabbcc", "aabbcc","b","bc","abcabc"}));
    }
    public static boolean isSubsequence(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++)
            if (x.charAt(j) == y.charAt(i)){
                j++;
            }
        return j == x.length();
    }
    public static int findLUSlength(String[] strs) {
        int res = -1;
        for (int i = 0, j; i < strs.length; i++) {
            for (j = 0; j < strs.length; j++) {
                if (j == i){
                    continue;
                }
                if (isSubsequence(strs[i], strs[j])){
                    break;
                }
            }
            if (j == strs.length){
                res = Math.max(res, strs[i].length());
            }
        }
        return res;
    }
    public static int findLUSlength1(String[] strs) {
        int res = 0;
        for (int i = 0; i < strs.length; i++) {
            int count = 0;
            int countSub = 0;
            for (int j = 0; j < strs.length; j++) {

                if (strs[j].equals(strs[i])) {
                    count++;
                    continue;
                }
                if (isSubsequence(strs[i], strs[j])) {
                    countSub++;
                }

            }
            if (count == strs.length) {

                return -1;
            } else if ((count > 1 && count < strs.length) || countSub > 0) {
                continue;
            } else {
                if (strs[i].length() > res) {
                    res = strs[i].length();
                }
            }
        }
        return res;

    }
    public static boolean isSubsequence1(String s, String t) {
        int index = 0;
        int tIndex = 0;
        while (tIndex < t.length() && index < s.length()) {
            if (t.charAt(tIndex) == s.charAt(index)) {
                ++index;
                ++tIndex;
            } else {
                while (tIndex < t.length() && t.charAt(tIndex) != s.charAt(index)) {
                    ++tIndex;
                }
            }
        }
        if (tIndex >= t.length() && index < s.length()) {
            return false;
        }
        return true;
    }
}
