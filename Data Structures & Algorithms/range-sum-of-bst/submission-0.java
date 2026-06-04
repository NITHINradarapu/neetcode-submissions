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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        // traverse left of root.val > low
        if(root.val > low){
            sum += rangeSumBST(root.left, low, high);
        }
        // check the root val
        if(root.val >= low && root.val <= high){
            sum += root.val;
        }
        // traverse right subtree only if roo.val < high
        if(root.val < high){
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}