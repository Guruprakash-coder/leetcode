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
    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        populatedSorted(nums,0,nums.length-1);
        return root;
    }
    private void populatedSorted(int[] nums,int start,int end){
        if(start>end){
            return;
        }
        int mid=(start+end)/2;
        root=insert(nums[mid]);
        populatedSorted(nums,start,mid-1);
        populatedSorted(nums,mid+1,end);

    }
    private TreeNode insert(int n){
        return insert(root,n);
    }
    private TreeNode insert(TreeNode node,int n){
        if(node==null){
            
            return new TreeNode(n);
        }
        if(n<node.val){
            node.left=insert(node.left,n);
        }else{
            node.right=insert(node.right,n);
        }
        return node;
    }
}