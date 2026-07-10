class Solution {
    private boolean dfs(int[][] graph,int[] vis,int node){
        vis[node]=2;
        for(int neigh:graph[node]){
            if(vis[neigh]==0){
                if(dfs(graph,vis,neigh)) return true;
            }else if(vis[neigh]==2){
                return true;
            }
            
        }
        vis[node]=1;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] vis=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0) dfs(graph,vis,i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(vis[i]==1){
                ans.add(i);
            }
        }
        return ans;
    }
}