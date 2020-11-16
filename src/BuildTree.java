import java.util.Arrays;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null)
            return  null;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i =0; i < inorder.length; i++){
            if(preorder[0] == inorder[i]){
                int[] preLeft = Arrays.copyOfRange(preorder, 1, i+1);
                int[] preRight = Arrays.copyOfRange(preorder, i+1, preorder.length);
                int[] inLeft = Arrays.copyOfRange(preorder, 1, i+1);
                int[] inRight = Arrays.copyOfRange(preorder, i+1, preorder.length);
                root.left = buildTree(preLeft, inLeft);
                root.right = buildTree(preRight, inLeft);
            }
        }

        return  root;
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
