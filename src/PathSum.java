import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> track= new ArrayList<>();
        dfs(root, sum, track, res);
        return  res;
    }
    public void dfs(TreeNode node, int sum, List<Integer> track, List<List<Integer>> res){
        if(node == null)
            return;
        if(node.left == null && node.right == null && sum - node.val == 0)
        {
            track.add(node.val);
            res.add(new ArrayList<>(track));
            return;
        }
        if(node.left != null){

            track.add(node.val);
            dfs(node.left, sum - node.val, track, res);
            track.remove(track.size() -1);
        }
        if(node.right != null){

            track.add(node.val);
            dfs(node.right, sum - node.val, track, res);
            track.remove(track.size() -1);
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
