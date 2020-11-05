public class IsSubtree {
    public boolean res;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        preorder(s, t);
        return res;
    }

    public void preorder(TreeNode s, TreeNode t) {
        if (s == null) return;
        res = res || isSameTree(s, t);
        preorder(s.left, t);
        preorder(s.right, t);
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val)
            return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
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
