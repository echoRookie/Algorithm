public class PathSum1 {
    public  int pathTotal;
    public int pathSum(TreeNode root, int sum) {
          if (root == null) return 0;
          sum(root, sum);
          pathSum(root.left, sum );
          pathSum(root.right, sum);
          return  pathTotal;
    }
    public void sum(TreeNode root, int sum){
        if(root == null) return;
        if(root.val == sum)
            pathTotal ++;
        sum(root.left, sum - root.val);
        sum(root.right, sum- root.val);
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
