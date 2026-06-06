/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode head = l1.val < l2.val?l1:l2;
        ListNode dummy = new ListNode();
        while(l1 != null && l2 != null){
            if(l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            }
            else{
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        dummy.next = (l1 == null)?l2:l1;
        return head;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = merge(head,lists[i]);
    }
    return head;
    }
}
