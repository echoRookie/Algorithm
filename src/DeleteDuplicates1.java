import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;

public class DeleteDuplicates1 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(deleteDuplicates(node1));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode first = new ListNode(0);
        first.next = null;

        ListNode point = first;
        int count = 0;
        ListNode temp = head;
        while (head != null) {
            while (head != null && head.val == temp.val) {
                count++;
                head = head.next;
            }
            if (count <= 1) {
                point.next = temp;
                point = point.next;
                temp = head;
                count = 0;
            } else {
                temp = head;
                count = 0;
            }
        }
        point.next = null;
        return first.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
