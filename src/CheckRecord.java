public class CheckRecord {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }

    public static boolean checkRecord(String s) {
        //统计A的数量
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                ++count;
            }
            if (count > 1) {
                return false;
            }
        }
        // 统计连续L是否超过两个
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == 'L') {
                int nums = 1;
                ++index;
                while (index < s.length() && s.charAt(index) == 'L') {
                    ++index;
                    ++nums;
                }
                if (nums > 2) {
                    return false;
                }
            } else {
                ++index;
            }
        }
        return true;
    }
}
