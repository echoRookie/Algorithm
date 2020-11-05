import java.util.*;

public class FindFrequentTreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        findSum(root, map);
        int[] res ;
        if(map.size() > 0){
            int max = Collections.max(map.values());
            List<Integer> result = new ArrayList<>();
            for (Integer key : map.keySet()) {
                if (max == map.get(key)) {
                    result.add(key);
                }
            }
             res = new int[result.size()];
            for(int i = 0; i< result.size(); i++)
                res[i] = result.get(i);
        }
        else{
            res = new int[]{};
        }

         return  res;
    }

    public void findSum(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return;
        int total = sum(root);
        if (map.containsKey(total)) {
            int value = map.get(total);
            value++;
            map.put(total, value);
        } else map.put(total, 1);
        findSum(root.left, map);
        findSum(root.right, map);
    }

    public int sum(TreeNode root) {
        if (root == null) return 0;
        return sum(root.left) + sum(root.right) + root.val;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
