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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode temp=d;
        //head=head.next;
        ListNode slow=head;
        ListNode fast=head;
        while(n-->0){
            fast=fast.next;
        }
        while(fast!=null){
            temp=temp.next;
            slow=slow.next;
            fast=fast.next;
        }
        temp.next=slow.next;
        return d.next;
    }
}