import java.util.Arrays;

public class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length <= 0)
            return  null;
        int index = max(nums);
        TreeNode node = new TreeNode(nums[index]);
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,index));
        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,index+1, nums.length));
        return  node;
    }
    // 返回数组最大值的索引
    public int max(int[] nums){
        int max = nums[0];
        int index = 0;
        for(int i= 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }

        }
        return index;
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
