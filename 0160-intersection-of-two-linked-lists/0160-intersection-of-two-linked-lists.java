/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           ListNode temp1 = new ListNode();
        ListNode temp2 = new ListNode();
        int len1=1;
        int len2=1;
        temp1= headA;
        temp2 = headB;
        while(temp1.next!=null)
        {
            len1++;
            temp1= temp1.next;
        }
        while(temp2.next!=null)
        {
            len2++;
            temp2= temp2.next;
        }
        temp1=headA;
        temp2=headB;
        int diff = Math.abs(len1-len2);
int i=0;
if(len1>len2)
{
    while(i!=diff)
    {
    temp1=temp1.next;
    i++;
    }
}
i=0;
if(len2>len1)
{
    while(i!=diff)
    {
    temp2=temp2.next;
    i++;
    }
}
while(temp1!=temp2)
{
    temp1=temp1.next;
    temp2=temp2.next;
}
return temp1;
    }
}