public class ReverseBetween {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(reverseBetween(node1, 1, 5).val);
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode start = first;

        int left = 1;
        while (left < m) {
            start = head;
            head = head.next;
            left++;
        }
        ListNode end = head;
        ListNode tail = end;
        head = head.next;
        while (left < n) {
            ListNode temp = head.next;
            head.next = end;
            end = head;
            head = temp;
            left++;
        }
        start.next = end;
        tail.next = head;
        return first.next;
    }

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

