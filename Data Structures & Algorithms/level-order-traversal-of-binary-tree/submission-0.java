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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                
                TreeNode node = que.poll();
                list.add(node.val);

                if(node.left != null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
