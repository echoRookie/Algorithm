public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fisrt = new ListNode(0);
        ListNode temp = fisrt;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int val = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;
            ListNode node = new ListNode(val);
            temp.next = node;
            temp = temp.next;
            if (l1 == null || l1.next == null) {
                l1 = null;
            } else {
                l1 = l1.next;
            }
            if (l2 == null || l2.next == null) {
                l2 = null;
            } else {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        temp.next = null;
        return fisrt.next;
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
