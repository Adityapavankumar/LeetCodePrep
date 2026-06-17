/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        // map to store all nodes
        Map<Integer, TreeNode> nodeMap = new HashMap<>();

        // set to store all children values
        Set<Integer> childValues = new HashSet<>();

        // loop through descriptions and create nodes for each
        for(int[] description:descriptions){
            int parentValue = description[0];
            int childValue = description[1];
            int isLeft = description[2];

            // create parent node and put it in nodeMap if it is not present already
            if(!nodeMap.containsKey(parentValue)){
                nodeMap.put(parentValue, new TreeNode(parentValue));
            }

            // create child node and put it in nodeMap if it is already not present
            if(!nodeMap.containsKey(childValue)){
                nodeMap.put(childValue, new TreeNode(childValue));
            }

            // now establish relation between both nodes using isLeft
            TreeNode parentNode = nodeMap.get(parentValue);
            TreeNode childNode = nodeMap.get(childValue);

            if(isLeft == 1){
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }

            // add child value to child set
            childValues.add(childValue);
        }

        // once all nodes are built, iterate through them and check if their key is not present in child set
        // the one entry not present in child set would be the root node
        for(Map.Entry<Integer, TreeNode> nodeEntry:nodeMap.entrySet()){
            if(!childValues.contains(nodeEntry.getKey())){
                return nodeEntry.getValue();
            }
        }

        return null; // if no root is found
    }
}