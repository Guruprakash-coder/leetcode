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
    public int sumNumbers(TreeNode root) {
        List<Integer> nums=new ArrayList<>();
        findNums(root,nums,0);
        int tot=0;
        for(int i=0;i<nums.size();i++){
            tot+=nums.get(i);
        }
        return tot;
    }
    private void findNums(TreeNode node,List<Integer> arr,int num){
        if(node==null){
            return;
        }
        num=num*10+node.val;
        if(node.left==null && node.right==null){
            arr.add(num);
        }

        findNums(node.left,arr,num);
        findNums(node.right,arr,num);
    }
}