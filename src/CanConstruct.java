public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineSum = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            ++magazineSum[magazine.charAt(i) - 'a'];
        }
        boolean flag = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            --magazineSum[ransomNote.charAt(i) - 'a'];
            if (magazineSum[ransomNote.charAt(i) - 'a'] < 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
