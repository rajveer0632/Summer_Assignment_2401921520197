class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode ans=null;

        if(t1.val>t2.val)
        {
            ans=list2;
            t2=t2.next;
        }
        else
        {
            ans=list1;
            t1=t1.next;
        }
        ListNode t3=ans;
        while(t1!=null && t2!=null)
        {
            if(t1.val<t2.val)
            {
                t3.next=t1;
                t1=t1.next;
            }
            else
            {
                t3.next=t2;
                t2=t2.next;
            }
            t3=t3.next;
        }
        while(t1!=null)
        {
            t3.next=t1;
            t1=t1.next;
            t3=t3.next;
        }
        while(t2!=null)
        {
            t3.next=t2;
            t2=t2.next;
            t3=t3.next;
        }
        return ans;
    }
}
