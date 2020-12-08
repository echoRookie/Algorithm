public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "c"));
    }

    public static boolean isSubsequence(String s, String t) {
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
