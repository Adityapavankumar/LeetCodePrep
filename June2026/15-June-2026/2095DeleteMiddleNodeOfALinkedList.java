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
        // create a dummyNode to hold the values
        ListNode dummyNode = new ListNode(0,head);

        // Initialize two pointers, one is slow and one is fast
        ListNode slowPointer = dummyNode;
        ListNode fastPointer = head;

        // move slowPointer one step but fastPointer two steps
        // so when fastPointer reaches the end, slowPointer reaches just before middle
        while(fastPointer != null&&fastPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        // now skip middle in slowPointer
        slowPointer.next = slowPointer.next.next;

        return dummyNode.next; // since initial is 0, we don't need it in result
    }
}