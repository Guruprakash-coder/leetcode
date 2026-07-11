class Solution {
    static int V,E;
    private void dfs(List<List<Integer>> adj,boolean[] vis,int node){
        V++;
        E+=adj.get(node).size();
        vis[node]=true;
        for(int neigh:adj.get(node)){
            if(!vis[neigh]){
                dfs(adj,vis,neigh);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p:edges){
            adj.get(p[0]).add(p[1]);
            adj.get(p[1]).add(p[0]);
        }
        boolean[] vis=new boolean[n];
        int count=0;
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                V=0;E=0;
                dfs(adj,vis,i);
                if(E== V*(V-1)) count++;
            }
        }
        return count;
    }
}