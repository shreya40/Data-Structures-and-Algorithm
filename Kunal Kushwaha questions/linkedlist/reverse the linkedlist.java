//using while loop

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur;
        cur=head;
        while(cur!=null)
        {
            ListNode temp= cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}

// video link to refer-https://www.youtube.com/watch?v=ugQ2DVJJroc
