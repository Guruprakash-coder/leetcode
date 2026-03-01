class Solution {
    public int minPartitions(String n) {
        int ans=0;
      for(int i=0;i<n.length();i++){
        //int crnt=(n.chartAt(i)-'0');
        ans=Math.max(ans,n.charAt(i)-'0');
        if(ans==9){
            return ans;
        }
      }  
      return ans;
    }
}