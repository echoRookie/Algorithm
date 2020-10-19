import java.util.ArrayList;
import java.util.List;

/*给定一个二叉树，返回它的中序 遍历。*/
public class InorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();
         inorder(root, result);
         return  result;

    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
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
