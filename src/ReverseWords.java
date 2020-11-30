import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("a   ba     "));
    }
    public static String reverseWords(String s) {
        String s1 = s + " ";
        char[] str = s1.toCharArray();
        int start = 0, end = 0;
        while (end < s1.length()){
            while (start <= s1.length() -1 && str[start]== ' '){
                ++start;
            }
            end = start;
            while (end <= s1.length() -1 && str[end]!= ' '){
                ++end;
            }
            reverse(str, start, end -1);
            start = end;
        }
        return new String(Arrays.copyOfRange(str, 0, str.length - 1));
    }
    public static void reverse(char[] str, int l, int r) {
        while(l <= r) {
            char tmp = str[l];
            str[l] = str[r];
            str[r] = tmp;
            l++;
            r--;
        }
    }
}
