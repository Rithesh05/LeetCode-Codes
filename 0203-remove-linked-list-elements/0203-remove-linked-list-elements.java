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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        while(head!=null && head.val==val ){
            head=head.next;
        }
        ListNode prev=head;
        ListNode curr=head;
        while(curr!=null){
           while(curr!=null && curr.val==val){
            prev.next=curr.next;
            curr=curr.next;
            
           }
           if(curr!=null){
            prev=curr;
            curr=curr.next;
           }
    }
    return head;
}
}