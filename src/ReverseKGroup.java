public class ReverseKGroup {
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
        System.out.println(reverseKGroup(node1, 3).val);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode temp = head;
        // 求链表的长度，判断循环的次数
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            ++length;
        }
        ListNode first = new ListNode(0);
        temp = first;

        int count = length / k;
        for (int i = 0; i < count; i++) {
            ListNode start = head;
            ListNode end = start;
            head = head.next;
            int n = k;
            while (n > 1) {
                ListNode next = head.next;
                head.next = start;
                start = head;
                head = next;
                n--;
            }
            temp.next = start;
            end.next = head;
            temp = end;
        }
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

