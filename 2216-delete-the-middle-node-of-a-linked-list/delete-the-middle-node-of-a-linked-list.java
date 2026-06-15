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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n==1){
            return null;
        }
        int mid=n/2;
        temp=head;
        int c=0;
        while(temp.next!=null){
            c++;
            if(c==mid){
                break;
            }
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}