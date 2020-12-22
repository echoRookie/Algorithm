import javax.xml.stream.events.Characters;
import java.util.*;

public class FindWords {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = getMap();
        List<String> list = new ArrayList<>();
        String[] res;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 1) {
                list.add(words[i]);
            } else {
                String temp = words[i].toUpperCase();
                boolean flag = true;
                int index = map.get(temp.charAt(0));
                for (int j = 1; j < temp.length(); j++) {
                    if (map.get(temp.charAt(j)) != index) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(words[i]);
                }
            }
        }
        if (list.size() == 0) {
            return new String[]{};
        } else {
            res = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }
    }

    public HashMap getMap() {
        HashMap<Character, Integer> map = new HashMap();
        //第一行
        map.put('Q', 1);
        map.put('W', 1);
        map.put('E', 1);
        map.put('R', 1);
        map.put('T', 1);
        map.put('Y', 1);
        map.put('U', 1);
        map.put('I', 1);
        map.put('O', 1);
        map.put('P', 1);
        //第二行
        map.put('A', 2);
        map.put('S', 2);
        map.put('D', 2);
        map.put('F', 2);
        map.put('G', 2);
        map.put('H', 2);
        map.put('J', 2);
        map.put('K', 2);
        map.put('L', 2);
        //第三行
        map.put('Z', 3);
        map.put('X', 3);
        map.put('C', 3);
        map.put('V', 3);
        map.put('B', 3);
        map.put('N', 3);
        map.put('M', 3);
        return map;
    }
}
