public class LongestUnivaluePath {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        preorder(root);

        return max-1;
    }
    // 前序遍历
    public void  preorder(TreeNode node){
        if(node == null) return;
        int left = maxDeep(node.left, node.val);
        int right = maxDeep(node.right, node.val);
        if(left + right + 1 > max)
            max = left + right + 1;
        preorder(node.left);
        preorder(node.right);
    }
    // dfs查找相同的最大深度
    public int maxDeep(TreeNode node, int val){
        if(node == null || node.val != val)
            return 0;
        int left = maxDeep(node.left, node.val);
        int right = maxDeep(node.right, node.val);
        return Math.max(left, right) + 1;
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
