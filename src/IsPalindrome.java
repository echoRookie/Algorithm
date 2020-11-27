import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome1("0P"));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                list.add(c);
            }
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (!(list.get(i) == list.get(list.size() - 1 - i) || list.get(i) - 32 == list.get(list.size() - 1 - i) || list.get(i) + 32 == list.get(list.size() - 1 - i))) {
                return false;
            }
            //防止0P的情况发生
            if ((list.get(i) >= '0' && list.get(i) <= '9' && list.get(list.size() - 1 - i) >= 'A' && list.get(list.size() - 1 - i) <= 'Z') || (list.get(i) >= 'A' && list.get(i) <= 'Z' && list.get(list.size() - 1 - i) >= '0' && list.get(list.size() - 1 - i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    //熟悉Java  API
    public static boolean isPalindrome1(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuffer.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuffer stringBufferNew = new StringBuffer(stringBuffer).reverse();
        return stringBuffer.toString().equals(stringBufferNew.toString());
    }
}
