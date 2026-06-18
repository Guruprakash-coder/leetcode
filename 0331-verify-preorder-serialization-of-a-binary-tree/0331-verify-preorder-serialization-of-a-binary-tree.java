class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes=preorder.split(",");
        int avail=1;
        for(String node:nodes){
            avail--;
            if(avail<0){
                return false;
            }
            if(node.charAt(0)!='#'){
                avail+=2;
            }
        }
        return avail==0;
    }
}