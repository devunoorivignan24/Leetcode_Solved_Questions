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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null){
            return null;
        }
        ListNode head=new ListNode(0);
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        for(ListNode list:lists){
            while(list!=null){
                arr.add(list.val);
                list=list.next;
            }
        }
        Collections.sort(arr);
        for(int a:arr){
            temp.next=new ListNode(a);
            temp=temp.next;
        }
        return head.next;
    }
}