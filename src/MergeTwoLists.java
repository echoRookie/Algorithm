public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node11 = new ListNode(1);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        node1.next = node2;
        node2.next = node4;
        node11.next = node13;
        node13.next = node14;
        System.out.println(mergeTwoLists(node1, node11).val);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        first.next = null;
        ListNode res = first;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                first.next = l2;
                first = first.next;
                l2 = l2.next;
            } else if (l2 == null) {
                first.next = l1;
                first = first.next;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    first.next = l1;
                    first = first.next;
                    l1 = l1.next;
                } else {
                    first.next = l2;
                    first = first.next;
                    l2 = l2.next;
                }
            }
        }
        return res.next;
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

