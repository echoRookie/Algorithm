import java.util.Arrays;

public class BuildTree1 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      if(inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0)
          return  null;
      TreeNode root = new TreeNode(postorder[postorder.length -1]);
      for(int i =0; i< inorder.length; ++i){
         if(postorder[postorder.length -1] == inorder[i]){
             int[] inLeft = Arrays.copyOfRange(inorder, 0, i);
             int[] inRight = Arrays.copyOfRange(inorder, i+1, inorder.length);
             int[] postLeft = Arrays.copyOfRange(postorder,0, inLeft.length);
             int[] postRight = Arrays.copyOfRange(postorder, inLeft.length, postorder.length-1);
             root.left = buildTree(inLeft, postLeft);
             root.right = buildTree(inRight, postRight);
         }
      }
      return root;
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
