import java.util.LinkedList;

public class Flatten {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
    }
    public void flatten(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        dfs(root, list);
       /* for (int a: list
             ) {
            System.out.println(a);
        }*/
        for (int i = 1; i< list.size() -1; i++){
            root.right = new TreeNode(list.get(i));
            root.left = null;
            root = root.right;
        }

    }
    public void dfs(TreeNode root, LinkedList<Integer> list){
        if(root == null)return;
        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
    public static class TreeNode {
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
