import java.util.ArrayList;
import java.util.List;

public class Postorder1 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        dfs(root, res);
        return res;
    }
    public void dfs(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        for (Node node : root.children) {
            dfs(node, res);
        }
        res.add(root.val);
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
