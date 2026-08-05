class Solution {
    private void dfs(int node,List<List<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int neigh:adj.get(node)){
            if(!vis[neigh]) dfs(neigh,adj,vis);
        }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:invocations){
            adj.get(edge[0]).add(edge[1]);
        }
        boolean[] vis=new boolean[n];
        dfs(k,adj,vis);
        for(int[] edge:invocations){
            if(vis[edge[0]]) continue;
            if(vis[edge[1]]){
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++){
                    ans.add(i);
                }
                return ans;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans.add(i);
            }
            
        }
        return ans;


    }
}