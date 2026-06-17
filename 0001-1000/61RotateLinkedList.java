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
        // check edge case
        if(head == null || head.next == null){
            return head;
        }

        // calculate length of linked list
        ListNode current = head;
        int length = 1;
        while(current.next != null){
            length += 1;
            current = current.next;
        }

        // optimise k
        k = k % length;

        if(k==0){
            // no need for any rotation
            return head;
        }

        // initiate two pointers slow, fast
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        // move fast pointer by k times
        for(int i=0;i<k;i++){
            fastPointer = fastPointer.next;
        }

        // now fastPointer is moved to kth element in the Linked list, slow pointer is at start
        // now move both until fastPointer.next != null
        while(fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        // now slowPointer is at (k-1)th position, fastPointer is at end
        // define newHead at slowPointer.next (starts at kth positon)
        // reset slowPointer end, to cut list
        // now we have two lists head which goes till slowPointer, newHead which goes from kth element to end
        // attach end to start: fastPointer.next = head
        ListNode newHead = slowPointer.next;
        slowPointer.next = null;
        fastPointer.next = head;

        return newHead;
    }
}