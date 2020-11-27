public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("b   a   "));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && i == s.length() - 1) {
                continue;
            } else if (s.charAt(i) == ' ' && i <= s.length() - 2 && s.charAt(i + 1) == ' ') {
                continue;
            } else if (s.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}
