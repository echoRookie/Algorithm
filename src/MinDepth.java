import java.util.ArrayDeque;
import java.util.Queue;

public class MinDepth {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root == null)
            return 0;

        queue.add(root);
        int step = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.right == null && node.left == null)
                    return step;
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            step ++;
        }
        return  step;
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
