import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords1 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world!  "));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        StringBuffer stringBuffer = new StringBuffer();
        char[] str = s.toCharArray();
        int start = s.length() - 1, end = s.length() - 1;
        while (end >= 0) {
            while (end >= 0 && str[end] != ' ') {
                --end;
            }
            for (int i = end + 1; i <= start; i++) {
                stringBuffer.append(str[i]);
            }
            stringBuffer.append(' ');
            start = end;
            while (start >= 0 && str[start] == ' ') {
                --start;
            }
            end = start;

        }
        return stringBuffer.toString().trim();
    }

    //API练习
    public static String reverseWords1(String s) {
        s = s.trim();
        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
