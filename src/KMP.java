public class KMP {
    public static void main(String[] args) {
        System.out.println(KMP("hello", "ll"));
    }
    public static void getNext(int[] next, String s){
        int j = 0;
        next[0] = 0;
        for (int i = 1; i<next.length; i++){
            while (j >0 && s.charAt(i) != s.charAt(j)){
                j = next[j -1];
            }
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }
            next[i] = j;
        }
    }
    public static int KMP(String s, String sub){
        if(sub == null || sub.length() == 0){
            return 0;
        }
        int[] next = new int[sub.length()];
        getNext(next, sub);
        int j = 0;
        for (int i =0;i<s.length();i++){
            while (j > 0 && s.charAt(i) != sub.charAt(j)){
                j = next[j-1];
            }
            if(s.charAt(i) == sub.charAt(j)){
                j++;
            }
            if(j == sub.length()){
                return i-sub.length() +1;
            }
        }
        return -1;
    }
}
