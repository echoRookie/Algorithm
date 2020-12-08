import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        int sum = 0;
        int index = 0;
        while (index < s.length()){
            if(index + 1 <= s.length()  -1){
                if(map.containsKey(s.substring(index,index+2))){
                    sum += map.get(s.substring(index, index +2));
                    index += 2;
                }
                else {
                    sum += map.get(String.valueOf(s.charAt(index)));
                    ++ index;
                }
            }
            else {
                sum += map.get(String.valueOf(s.charAt(index)));
                ++ index;
            }
        }
        return sum;
    }
}
