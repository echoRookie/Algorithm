import java.util.Stack;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        System.out.println(swapPairs(node1).val);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode first = new ListNode(0);
        ListNode temp = new ListNode(0);
        first.next = head;
        temp = first;
        while (head != null) {
            if (head.next == null) {
                first.next = head;
                break;
            }
            ListNode tail = head.next.next;
            first.next = head.next;
            first = first.next;
            first.next = head;
            first = first.next;
            first.next = null;
            head = tail;
        }
        return temp.next;
    }

    //Definition for singly-linked list.
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
