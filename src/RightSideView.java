import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> res = new ArrayList<>();
       if(root == null) return  res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (! queue.isEmpty()){
            int size = queue.size();
            for(int i= 0; i< size; i++){
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.add(node.left);
                if(node.left != null)
                    queue.add(node.left);
                if(i == size -1)
                    res.add(node.val);
            }
        }
        return res;

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
