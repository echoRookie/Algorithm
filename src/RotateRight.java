import java.util.Stack;

public class RotateRight {
    public static void main(String[] args) {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);
        ListNode node5= new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        rotateRight(node1, 2);
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();
        int length = 0;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
            ++ length;
        }
        int count = k%length;
        ListNode first = head;
        while (count!=0){
           ListNode pop = stack.pop();
           pop.next = first;
           first = pop;
           -- count;
        }
        stack.peek().next = null;
        return first;
    }
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
