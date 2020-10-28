import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return  res;
        queue.add(root);
        while (! queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i< size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            res.add(list);
        }
        List<List<Integer>> res1 = new ArrayList<>();
        for(int i = res.size() -1; i>= 0; i--)
        {
            List<Integer> list = res.get(i);
            List<Integer> list1 = res.get(i);
            for (int j = 0; j< list.size(); j++){
                list1.add(list.get(j));
            }
            res1.add(list1);
        }
        return res1;
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
