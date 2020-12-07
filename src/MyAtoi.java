public class MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }
    public static int myAtoi(String s) {
        s = s.trim();
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (Character.isDigit(s.charAt(0)) || s.charAt(0) == '+' || s.charAt(0) == '-') {
            int index = 1;
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                ++index;
                Long res = Long.valueOf(s.substring(0, index));
                if (res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (res < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            // 防止+-12情况的出现
            if (index == 1 && (s.charAt(0) == '+' || s.charAt(0) == '-')) {
                return 0;
            }

            Long res = Long.valueOf(s.substring(0, index));
            if (res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.valueOf(s.substring(0, index));
            }
        } else {
            return 0;
        }
    }
}
