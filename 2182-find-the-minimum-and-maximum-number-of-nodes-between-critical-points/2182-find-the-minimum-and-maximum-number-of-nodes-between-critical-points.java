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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode next=head.next.next;
        int[] arr=new int[]{-1,-1};
        ArrayList<Integer> list=new ArrayList<>();
        int i=2;
        while(next!=null){
            if((prev.val>curr.val && curr.val <next.val) || (prev.val<curr.val && curr.val>next.val)){
                list.add(i);
            }
            prev=prev.next;
            curr=curr.next;
            next=next.next;
            i++;
        }
        System.out.println(list);
        if(list.size()>=2){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<list.size()-1;j++){
                min=Math.min(min,list.get(j+1)-list.get(j));
            }
        arr[0]=min;
        arr[1]=list.get(list.size()-1)-list.get(0);
        }
        return arr;
    }
}