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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        boolean rev=false;
        q.offer(root);
        while(!q.isEmpty()){
            int LevelSize=q.size();
            LinkedList<Integer> cl=new LinkedList<>();
            for(int i=0;i<LevelSize;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                if(rev){
                    cl.add(0,curr.val);
                }else{
                    cl.add(curr.val);
                }

            }
            result.add(cl);
            rev=rev==true?false:true;
        }
        return result;

    }
}