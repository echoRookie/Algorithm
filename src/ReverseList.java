public class ReverseList {
    //迭代
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = null;
        while (head !=null){
            head.next = temp;
            temp = head;
            head = head.next;
        }
        return temp;
    }
    // 递归
    public ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode first = new ListNode(0);
        ListNode temp = first;
        recursion(head, first).next = null;
        return temp.next;
    }

    //递归
    public ListNode recursion(ListNode head, ListNode first) {
        if (head.next == null) {
            first.next = head;
            first = first.next;
            return first;
        }
        ListNode res = recursion(head.next, first);
        res.next = head;
        res = res.next;
        return res;
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
