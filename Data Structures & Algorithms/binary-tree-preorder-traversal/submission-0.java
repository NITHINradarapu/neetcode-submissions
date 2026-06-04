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
    public List<Integer> preorderTraversal(TreeNode root) {
        // Preorder 
        // root left right
        List<Integer> list = new ArrayList<>();

        preorder(root, list);

        return list;
    }

    public List<Integer> preorder(TreeNode root, List<Integer> list){
        // base case
        if(root == null) return list;
        // actual case
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);

        return list;
    }
}