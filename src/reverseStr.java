public class reverseStr {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcd", 4));
    }

    public static String reverseStr(String s, int k) {
        if (k <= 1) {
            return s;
        }
        int length = s.length();
        char[] chars = s.toCharArray();
        int index = 0;
        while (index <= length - 1) {
            if (length - index < k) {
                swap(index, length - 1, chars);
                break;
            } else if (length - index >= k && length - index < 2 * k) {
                swap(index, index + k - 1, chars);
                break;
            } else {
                swap(index, index + k - 1, chars);
                index += 2 * k;
            }
        }
        return String.valueOf(chars);
    }

    public static void swap(int start, int end, char[] chars) {
        int index = 0;
        int count = (end - start) / 2;
        while (index <= count) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            ++index;
            ++start;
            --end;
        }
    }
}
