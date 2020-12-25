import java.util.List;
import java.util.spi.LocaleServiceProvider;

public class DeleteDuplicates {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        System.out.println(deleteDuplicates(node1).val);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode temp = first.next;
        head = head.next;
        while (head != null) {
            if (temp.val != head.val) {
                temp.next = head;
                head = head.next;
                temp = temp.next;
            } else {
                head = head.next;
            }
        }
        temp.next = null;
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
