/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        convert(root,sb);
        
        return sb.toString();
    }
    private void convert(TreeNode node,StringBuilder sb){
        if(node==null){
            sb.append("N,");
            return;
        }
        sb.append(node.val).append(",");
        convert(node.left,sb);
        convert(node.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        return helper(arr);
    }
    int index=0;
    private TreeNode helper(String[] arr){
        if(arr[index].equals("N")){
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(arr[index]));
        index++;
        node.left=helper(arr);
        index++;
        node.right=helper(arr);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;