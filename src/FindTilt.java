public class FindTilt {
    public int findTilt(TreeNode root) {
          if(root == null) return 0;
          // 左子树和
        int sumLeft = sum(root.left);
        // 右子树和
        int sumRight = sum(root.right);
        // 计算梯度
        return  findTilt(root.left) + findTilt(root.right) + Math.abs(sumLeft - sumRight);
    }
    public int sum(TreeNode root){
        if(root == null) return 0;
        return sum(root.left) + sum(root.right) + root.val;

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
