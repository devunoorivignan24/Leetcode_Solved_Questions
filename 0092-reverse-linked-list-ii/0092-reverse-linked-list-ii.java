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
   public ListNode reverse(ListNode head){
		ListNode ne=null,prev=null;
		ListNode curr=head;
		while(curr!=null){
			ne=curr.next;
			curr.next=prev;
			prev=curr;
			curr=ne;
		}
		return prev;
	}
    public ListNode reverseBetween(ListNode head, int m, int n) {
         ListNode head1=head;
		ListNode curr=head;
		for(int i=1;i<n;i++){
			curr=curr.next;
		}
		ListNode head2=curr.next;
		curr.next=null;
		curr=head;
		ListNode head3=null,temp=null;
		if(m==1){
			 head3=head;
			temp=reverse(head3);
			 curr=temp;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=head2;
		return temp;
		}else{
			for(int i=1;i<(m-1);i++){
			curr=curr.next;
		}
		 head3=curr.next;
		curr.next=null;
			 curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=reverse(head3);
		 curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=head2;
		}		
      
		return head1;
    }
}