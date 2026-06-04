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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null; 
        Stack<ListNode> l = new Stack<>();
        ListNode Result = new ListNode();
        ListNode curr = head;
        while(curr.next != null){
            l.push(curr);
            curr = curr.next;
        }
        ListNode newHead = curr;
        Result = curr;
        while(!l.isEmpty()){
            Result.next = l.pop();
            Result = Result.next;
        }
        Result.next = null;
        return newHead;
        
    }
}
