public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (i > strs[j].length() - 1 || i > strs[j + 1].length() - 1 || strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return stringBuffer.toString();
                }
            }
            stringBuffer.append(strs[0].charAt(i));
        }
        return stringBuffer.toString();
    }
}
