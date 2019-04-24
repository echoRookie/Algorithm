package Array;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 */
public class TestThree {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0 ||) {
            return 0;
        }
        int end = s.length();
        while ((s.charAt(end - 1) == ' ') && (end > 1)) {
            end -= 1;
        }
        int start = end;
        for (; start > 0; start--) {
            if (s.charAt(start - 1) == ' ')
                break;
        }
        return end - start;
    }
}
