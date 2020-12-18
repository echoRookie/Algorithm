import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode first = new ListNode(0);
        first.next = null;
        ListNode temp = first;
        while (!isEmpty(lists)) {
            int index = minIndex(lists);
            first.next = lists[index];
            first = first.next;
            lists[index] = lists[index].next;
        }
        return temp.next;
    }

    // 判断链表是否都已经为空
    public boolean isEmpty(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                return false;
            }
        }
        return true;
    }

    // 返回链表最小值的索引
    public int minIndex(ListNode[] lists) {
        int index = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                if (lists[i].val <= res) {
                    res = lists[i].val;
                    index = i;
                }
            }
        }
        return index;
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
