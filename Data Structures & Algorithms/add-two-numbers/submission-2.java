class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return new ListNode();
        ListNode head = l1;
        int car = 0;
        int sum = 0;
        while(l1.next != null){
            if(l2 == null) {
                sum = l1.val + car;
                l1.val = sum%10;
                car = sum/10;
                if(l1.next.next == null){
                    l1 = l1.next;
                    sum = l1.val + car;
                    l1.val = sum%10;
                    if(sum/10 > 0){
                        l1.next = new ListNode();
                        l1.next.val = car;
                    }
                    return head;
                } 
                l1 = l1.next;
                continue;
            }
            sum = l1.val + l2.val + car;
            l1.val = sum%10;
            car = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        // Fix A: Safe check in case l2 is already null
        sum = l1.val + (l2 != null ? l2.val : 0) + car;
        l1.val = sum%10;
        car = sum/10; // Make sure the carry updates here!
        
        // Fix B: Move l2 forward because its current node was just processed above
        if (l2 != null) l2 = l2.next; 
        
        while(l2 != null){
            l1.next = new ListNode();
            l1 = l1.next;
            sum = l2.val + car;
            l1.val = sum%10;
            
            if(sum/10 > 0){
                if(l2.next == null){
                    l1.next = new ListNode();
                    l1 = l1.next;
                    l1.val = sum/10;
                    return head; // Return head here instead of l1 to preserve the list
                }
            }
            
            // The Fix: These must happen every iteration, not just when sum/10 > 0!
            car = sum/10;
            l2 = l2.next; 
        }
        
        // Final guard: If both lists finished but a carry remains at the very end
        if (car > 0) {
            l1.next = new ListNode(car);
        }
        
        return head;
    }
}