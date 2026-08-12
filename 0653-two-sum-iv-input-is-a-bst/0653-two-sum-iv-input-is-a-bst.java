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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> s=new HashSet<>();
        return dfs(root,k,s);
    }
    private boolean dfs(TreeNode node,int k,Set<Integer> s){
        if(node==null) return false;
        if(s.contains(k-node.val)) return true;
        s.add(node.val);
        
        return dfs(node.left,k,s) || dfs(node.right,k,s);
    }
}