class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head, slow = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode current=slow.next, prev = null;
        while(current!=null)
        {
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        slow.next=prev;
        slow=slow.next;
        ListNode temp=head;
        while(slow!=null)
        {
            if(slow.val!=temp.val)
            {
                return false;
            }
            slow=slow.next;
            temp=temp.next;
        }
        return true;
    }
}