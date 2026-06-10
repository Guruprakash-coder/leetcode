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
    public void flatten(TreeNode root) {
        if(root==null){
            return; 
        }
        Queue<TreeNode> q=new LinkedList<>();
        getQueue(root,q);
        TreeNode prev=q.poll();
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            prev.left=null;
            curr.left=null;
            prev.right=curr;
            prev=curr;
        }
        
    }
    private void getQueue(TreeNode node,Queue<TreeNode > q){{
        if(node==null) return;

        q.offer(node);
        getQueue(node.left,q);
        getQueue(node.right,q);
    }

    }
}