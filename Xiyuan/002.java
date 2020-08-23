public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNodel2)
    {
        if (l1==null) return l2;
        if (l2==null) return l1;

        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;
        
        int carry = 0;

        while(l1!=null || l2!=null)
        {
            int x=l1 ==null?0:l1.val;
            int y=l2 ==null?0:l2.val;

            int sum = carry + x +y;
            carry = sum/10;

            p.next = new ListNode(carry%10);
            l1=l1.next;
            l2=l2.next;
        if (carry != 0)
            p.next = new ListNode(carry);

        return dummyNode.next;
    }

}