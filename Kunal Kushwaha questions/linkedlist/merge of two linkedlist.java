class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = new ListNode();
        // when did new ListNode() merged got created and val got assigned value 0
        // So assigning head to start of merged.. head has value 0
        // can traverse merged now..but head will keep pointing to merged
        ListNode head = merged;
        // if either of l1 or l2 is still having values
        while(l1 != null || l2 != null){
            ListNode temp;
            // If l1 is null..only take values of l2
            if(l1 == null){
                temp = new ListNode(l2.val);
                merged.next = temp;
                merged = merged.next;
                l2 = l2.next; 
            }
            // if l2 is null.. only take values of l1
            else if(l2 == null){
                temp = new ListNode(l1.val);
                merged.next = temp;
                merged = merged.next;
                l1 = l1.next;
            }
            // neither list are null
            else{
                if(l1.val <= l2.val){
                    temp = new ListNode(l1.val);
                    merged.next = temp;
                    // Doing merged = merged.next will traverse merged..
                    // The pointer won't be on the first position of merged
                    // That is why we used head earlier
                    merged = merged.next;
                    l1 = l1.next;
                }
                else if(l2.val < l1.val){
                    temp = new ListNode(l2.val);
                    merged.next = temp;
                    merged = merged.next;
                    l2 = l2.next;
                }
            }
                        
        }
        head = head.next;
        return head;
    }
}
