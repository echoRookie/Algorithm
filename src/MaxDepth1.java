import java.util.List;

public class MaxDepth1 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        if (root.children != null && root.children.size() > 0) {

            for (Node node : root.children) {
                int deep = maxDepth(node);
                if (deep > max) {
                    max = deep;
                }
            }
        }
        return max + 1;
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
