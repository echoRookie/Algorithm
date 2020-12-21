import sun.applet.resources.MsgAppletViewer;

import java.util.*;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (i > 0 && nums2[i] == nums2[i - 1]) {
                continue;
            }
            if (map.containsKey(nums2[i])) {
                list.add(nums2[i]);
            }

        }
        if (list.size() <= 0) {

            return new int[]{};
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
