import java.util.LinkedList;
import java.util.Stack;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
      int length = getLength(head);
      ListNode first = new ListNode(0);
      first.next = head;
      ListNode pre = first;
      ListNode cur = head;
      for (int i = 0; i<= length - n; i++){
          if(i != length - n){
              pre = cur;
              cur = cur.next;
          }
          else {
              pre.next = cur.next;
          }
      }
      return first.next;
    }
    // 栈的方法
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode ord = null;
        stack.peek().next = ord;
        for (int i = 1; i<= n; i++){
            if (i != n){
                ord = stack.pop();
            }else {
                ord = stack.pop();
                if(stack.isEmpty()){
                    temp = ord.next;
                }else {
                    ListNode pre = stack.pop();
                    pre.next = ord.next;
                }
            }
        }
        return temp;
    }
    // 双指针
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode left = head;
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode right = first;
        while (n != 0) {
            left = left.next;
            --n;
        }
        while (left != null) {
            left = left.next;
            right = right.next;
        }
        right.next = right.next.next;
        return first.next;
    }
    public static int getLength(ListNode head){
       int length  = 0;
       while (head != null){
           ++length;
           head = head.next;
       }
       return length;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
