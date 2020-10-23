public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return (Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1) && isBalanced(root.left) && isBalanced(root.right);

    }
    public int maxDepth(TreeNode node){
        if(node == null) return 0;
        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
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
