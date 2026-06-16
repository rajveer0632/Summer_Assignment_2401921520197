class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            head=null;
            return head;
        }
        int count =0;
        ListNode t=head;
        while(t!=null)
        {
            count++;
            t=t.next;
        }
        if(n==count)
        {
            head=head.next;
            return head;
        }
        ListNode t1=head;
        for(int i=0;i<count-n-1;i++)
        {
            t1=t1.next;
        }
        ListNode temp3=t1.next.next;
        t1.next=temp3;
        return head;
    }
}
