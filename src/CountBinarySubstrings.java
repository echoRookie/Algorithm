import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110"));
    }
    public static int countBinarySubstrings(String s) {
        // 统计相邻的个数
        List<Integer> counts = new ArrayList<Integer>();
        int start = 0;
        while (start < s.length()){
            char temp = s.charAt(start);
            int sum = 1;
            ++ start;
            while (start < s.length() && s.charAt(start) == temp){
                ++ sum;
                ++ start;
            }
            counts.add(sum);

        }
        int count = 0;
        for (int i =0 ; i< counts.size() -1; i++){
            count = count + Math.min(counts.get(i), counts.get(i + 1));
        }
        return count;
    }


}
