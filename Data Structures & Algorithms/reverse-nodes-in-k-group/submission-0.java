/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverse(ListNode head, ListNode tail){
        ListNode prev = null;
        while(head != tail){
            ListNode now = null;
            if(head.next != null) now = head.next;
            head.next = prev;
            prev = head;
            head = now;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode jimmy = dummy;
        while(head != null){
            ListNode chead = head;
            for(int i = 0; i < k;i++){
                if(chead == null){
                dummy.next = head;
                return jimmy.next;
                }
                chead = chead.next;
            }
            dummy.next = reverse(head,chead);
            while(dummy.next != null){
                dummy = dummy.next;
            }
             //if (result == null) result = chead;
            head = chead;
        }
        return jimmy.next;

    }
}
