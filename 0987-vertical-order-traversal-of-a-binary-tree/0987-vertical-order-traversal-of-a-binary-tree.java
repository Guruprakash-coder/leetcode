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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,List<int[]>> m=new TreeMap<>();
        dfs(m,root,0,0);
        List<List<Integer>> ans=new ArrayList<>();
        for(List<int[]> list:m.values()){
            list.sort((a,b)->{
                if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
                return Integer.compare(a[1],b[1]);
            });
            List<Integer> col=new ArrayList<>();
            for(int[] arr:list){
                col.add(arr[1]);
            }
            ans.add(col);
        }
        return ans;

    }
    private void dfs(Map<Integer,List<int[]>> m,TreeNode node,int c,int r){
        if(node==null) return;
        if(!m.containsKey(c)) m.put(c,new ArrayList<>());
        m.get(c).add(new int[]{r,node.val});
        dfs(m,node.left,c-1,r+1);
        dfs(m,node.right,c+1,r+1);
    }
}