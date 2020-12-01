public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] sSum = new int[26];
        int[] tSum = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ++sSum[s.charAt(i) - 97];
        }
        for (int i = 0; i < t.length(); i++) {
            ++tSum[t.charAt(i) - 97];
        }
        char res = ' ';
        for (int i = 0; i < sSum.length; i++) {
            if (sSum[i] != tSum[i]) {
                res = (char) ('a' + i);
                break;
            }
        }
        return res;
    }
}
