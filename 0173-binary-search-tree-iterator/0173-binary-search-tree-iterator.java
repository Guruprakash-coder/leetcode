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
class BSTIterator {
    ArrayList<Integer> list=new ArrayList<>();
    int i=0;
    public BSTIterator(TreeNode root) {
        helper(root,list);
    }
    private void helper(TreeNode node,ArrayList<Integer> list){
        if(node==null){
            return;
        }
        helper(node.left,list);
        list.add(node.val);
        helper(node.right,list);

    }

    
    public int next() {
        i++;
        return list.get(i-1);
    }
    
    public boolean hasNext() {
        if(i<list.size()){
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */