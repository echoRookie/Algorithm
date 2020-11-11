public class SearchBST {
    TreeNode node;

    public TreeNode searchBST(TreeNode root, int val) {
        search(root, val);
        return node;
    }

    public void search(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        if (root.val == val) {
            node = root;
            return;
        }
        if (root.val > val) {
            search(root.left, val);
        }
        if (root.val < val) {
            search(root.right, val);
        }
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
