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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if (list2 == null) return list1;
        if(list1.val > list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode head = list1;
        while(list2 != null){
            if(list1.next == null){
                if(list1.val > list2.val){
                    ListNode temp =list1;
                    temp.next = list2.next;
                    list1 = list2;
                    list1.next = temp;
                }
                else{
                    list1.next = list2;
                }
                return head;
                }
            if(list1.next.val > list2.val){
                ListNode temp = new ListNode();
                temp.val = list2.val;
                temp.next = list1.next;
                list1.next = temp;
                list2 = list2.next;
            }
            else {
                list1 = list1.next;
            }
            
        }
        return head;
        
    }
}