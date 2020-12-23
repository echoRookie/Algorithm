public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        if (s.equals(new StringBuffer(s).reverse().toString())) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                int leftTemp = left + 1;
                boolean leftFlag = true;
                int rightTemp = right - 1;
                boolean rightFlag = true;
                while (leftTemp < right) {
                    if (s.charAt(leftTemp) == s.charAt(right)) {
                        leftTemp++;
                        right--;
                    } else {
                        leftFlag = false;
                        break;
                    }
                }
                while (left < rightTemp) {
                    if (s.charAt(left) == s.charAt(rightTemp)) {
                        left++;
                        rightTemp--;
                    } else {
                        rightFlag = false;
                        break;
                    }
                }
                return leftFlag || rightFlag;
            }
        }
        return true;
    }
}
