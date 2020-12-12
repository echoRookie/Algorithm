public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
    }
    public static int strStr(String haystack, String needle) {
        int res = -1;
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            int k = i;
            int j = 0;
            while (k <= haystack.length() - 1 && j <= needle.length() - 1 && haystack.charAt(k) == needle.charAt(j)) {
                k++;
                j++;
            }
            if (j >= needle.length()) {
                return i;
            }
        }
        return res;
    }
    // 用KMP算法实现
    public static int strStr1(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while(j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length() ) {
                return (i - needle.length() + 1);
            }
        }
        return -1;
    }
    // 获取前缀next表
    public static void getNext(int[] next,  String needle){
        int j = 0;
        next[0] = 0;
        for(int i = 1; i < needle.length(); i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
    }
}
