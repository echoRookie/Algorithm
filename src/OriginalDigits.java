public class OriginalDigits {
    public String originalDigits(String s) {
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ++nums[s.charAt(i) - 'a'];
        }
        int res[] = new int[10];
        res[0] = nums['z' - 'a'];
        res[2] = nums['w' - 'a'];
        res[4] = nums['u' - 'a'];
        res[6] = nums['x' - 'a'];
        res[8] = nums['g' - 'a'];
        res[3] = nums['h' - 'a'] - res[8];
        res[5] = nums['f' - 'a'] - res[4];
        res[7] = nums['s' - 'a'] - res[6];
        res[9] = nums['i' - 'a'] - res[5] - res[6] - res[8];
        res[0] = nums['n' - 'a'] - res[7] - res[9];
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i]; j++) {
                stringBuffer.append(i);
            }
        }
        return stringBuffer.toString();
    }
}
