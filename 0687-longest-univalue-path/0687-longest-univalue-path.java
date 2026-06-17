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
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper(root,root.val);
        return max;
    }
    private int helper(TreeNode node,int prev){
        if(node==null){
            return 0;
        }
        int left=helper(node.left,node.val);
        int right=helper(node.right,node.val);
        max=Math.max(max,left+right);
        if(node.val==prev){
            return Math.max(left,right)+1;
        }
        return 0;
    }
}