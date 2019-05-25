class Solution {
     public ListNode reverseList(ListNode head) {
      ListNode result = null;
      while(head != null){
          ListNode temp = head.next;
          head.next = result;
          result = head;
          head = temp;
      }
      return result;
    }
}