import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        return  helper(s, t) && helper(t, s);
    }
    public boolean helper(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b){
                    return false;
                }
            }
            else {
                map.put(a, b);
            }
        }
        return true;
    }
}
