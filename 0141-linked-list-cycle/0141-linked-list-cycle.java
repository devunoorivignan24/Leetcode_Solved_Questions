/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s=head;
        
        //checking if there is only 1 node
        if(head==null || head.next==null){
            return false;
        }
        ListNode f=head.next;
        //traversing using the loop 
        while(f!=null && f.next!=null){
            if(f==s){
                return true;
            }
            s=s.next;
            f=f.next.next;
        }
        return false;
    }
}