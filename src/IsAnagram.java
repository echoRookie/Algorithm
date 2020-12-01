public class IsAnagram {
    public boolean isAnagram(String s, String t) {
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
