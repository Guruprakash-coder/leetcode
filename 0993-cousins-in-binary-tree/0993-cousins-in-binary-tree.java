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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);

        return ((level(xx,root,0)==level(yy,root,0)) && (!isSiblings(root,xx,yy)) );
    }
    private int level(TreeNode x,TreeNode node,int level){
        if(node == null){
            return 0;
        }
        if(node==x){
            return level;
        }
        int l=level(x,node.left,level+1);
        if(l!=0){
            return l;
        }
        return level(x,node.right,level+1);

    }
    private boolean isSiblings(TreeNode node,TreeNode x,TreeNode y){
        if(node==null){
            return false;
        }    
       

        return ((node.left==x && node.right==y) || (node.left==y && node.right==x)) || isSiblings(node.left,x,y) || isSiblings(node.right,x,y);

    }
    private TreeNode findNode(TreeNode node,int x){
        if(node==null){
            return null;
        }
        if(node.val==x){
            return node;
        }
        TreeNode n=findNode(node.left,x);
        if(n!=null){
            return n;
        }
        return findNode(node.right,x);
    }
}