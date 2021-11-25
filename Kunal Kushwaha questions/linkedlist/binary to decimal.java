//function IMP.

class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode t= head;String s="";
        while(t!=null)
        {
       
        s=s+ t.val;
            t=t.next;
        }
        int x=Integer.parseInt(s,2);
       return x;
        
        
    }
}
