class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                count++;
                dfs(isConnected,i,vis);
            }
        }
        return count;

    }

    
    private void dfs(int[][] connected,int node,boolean[] vis){
        vis[node]=true;
        for(int i=0;i<connected.length;i++){
            
            if(connected[node][i]==1 && !vis[i]){
                dfs(connected,i,vis);
            }
        }
    }
}