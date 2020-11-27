public class CountSegments {
    public static void main(String[] args) {
        System.out.println(countSegments("H"));
    }

    public static int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.length() == 1 && s.charAt(i) != ' ') {
                    return ++count;
                } else {
                    continue;
                }
            }
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                count++;
            }
            if (i == s.length() - 1 && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
