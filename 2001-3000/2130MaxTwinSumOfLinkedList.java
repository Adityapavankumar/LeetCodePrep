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
    public int pairSum(ListNode head) {
        // first create a list to store values
        List<Integer> nodeValues = new ArrayList<>();

        // traverse through linked list and store values in the array list
        ListNode current = head;
        while(current != null){
            nodeValues.add(current.val);
            current = current.next;
        }

        // initialize max sum
        int maxSum = 0;
        int listSize = nodeValues.size();

        // calculate max twin sum
        for(int i=0;i<listSize;i++){
            int twinSum = nodeValues.get(i) + nodeValues.get(listSize - i -1);
            maxSum = Math.max(maxSum, twinSum);
        }
        return maxSum;
    }
}