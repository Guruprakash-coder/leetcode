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
    public boolean isSymmetric(TreeNode root) {
        return isSyn(root.left,root.right);
    }
    boolean isSyn(TreeNode p,TreeNode q){
        
        if(q==null || p==null){
            return p==q;
        }
        if(p.val != q.val){
            return false;
        }

        return isSyn(p.left,q.right) && isSyn(p.right,q.left);
    }
}