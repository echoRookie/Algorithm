import java.util.LinkedList;

public class Flatten1 {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        LinkedList<Node> list = new LinkedList<>();
        recursion(head, list);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        for (int i = list.size() - 1; i > 0; i--) {
            list.get(i).prev = list.get(i - 1);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).child = null;
        }
        return list.get(0);
    }

    public void recursion(Node head, LinkedList<Node> list) {
        if (head == null) {
            return;
        }
        list.add(head);
        Node next = head.next;
        if (head.child != null) {

            recursion(head.child, list);
        }
        if (next != null) {
            recursion(next, list);
        }
    }

    // 递归不存储版本
    public Node flatten1(Node head) {
        if (head == null) {
            return null;
        }
        Node pre = new Node(0, null, head, null);
        recursion1(pre, head);
        pre.next.prev = null;
        return pre.next;
    }

    public Node recursion1(Node pre, Node cur) {
        if (cur == null) {
            return pre;
        }
        cur.prev = pre;
        pre.next = cur;
        Node tempNext = cur.next;
        Node res = recursion1(cur, cur.next);
        res.child = null;
        return recursion1(res, tempNext);

    }

    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {
        }

        public Node(int _val, Node _prev, Node _next, Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }

}
