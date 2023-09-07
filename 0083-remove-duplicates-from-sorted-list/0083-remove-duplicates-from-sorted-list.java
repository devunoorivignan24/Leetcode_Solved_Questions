/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //Checking if head node is null
        if(head==null || head.next==null){
            return head;
        }
        //traversing through the loop
        ListNode curr1=head;
        while(curr1!=null){
            ListNode temp=curr1;
            while(temp!=null && temp.val==curr1.val)temp=temp.next;
            curr1.next=temp;
            curr1=curr1.next;
        }
        return head;
    }
}