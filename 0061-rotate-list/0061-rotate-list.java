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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        int cut=k%len;
        if(cut==0){
            return head;
        }
        ListNode first=head;
        ListNode second=head;
        for(int i=0;i<cut;i++){
            second=second.next;
        }
        while(second.next!=null){
            first=first.next;
            second=second.next;
        }
        temp=first.next;
        first.next=null;
        second.next=head;
        head=temp;
        return head;

    }
}