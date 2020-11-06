public class DiameterOfBinaryTree {
    public int res;
    public int diameterOfBinaryTree(TreeNode root) {
           dfs(root);
           return  res;
    }
    public int dfs(TreeNode node){
        if(node  == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        res = Math.max(res, left + right);
        return Math.max(left, right) +1;
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
