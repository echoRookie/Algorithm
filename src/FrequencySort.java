import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            // 升序排序
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < list.get(i).getValue(); j++) {
                stringBuffer.append(list.get(i).getKey());
            }
        }

        return stringBuffer.toString();
    }
}
