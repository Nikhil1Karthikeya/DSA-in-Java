package LinkedList;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode(-1);
        ListNode tail=dum;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        int sum=0;
        int digit;
        while(temp1!=null||temp2!=null){
        int val1=0;
        int val2=0;
        if(temp1!=null){
        val1=temp1.val;
        temp1=temp1.next;
        }
        if(temp2!=null){
        val2=temp2.val;
        temp2=temp2.next;
        }
sum=val1+val2+carry;
digit=sum%10;
carry=sum/10;
tail.next=new ListNode(digit);
tail=tail.next;
        }
        if(carry>0){
        tail.next=new ListNode(carry);
        }
        return dum.next;
    }
}