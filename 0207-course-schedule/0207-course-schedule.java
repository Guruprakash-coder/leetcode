class Solution {
    private boolean dfs(List<List<Integer>> adj,int[] vis,int node){
        vis[node]=2;
        for(int neigh:adj.get(node)){
            if(vis[neigh]==0){
                if(dfs(adj,vis,neigh)) return true;
            }else if(vis[neigh]==2){
                return true;
            }
        }
        vis[node]=1;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            adj.get(p[1]).add(p[0]);
        }
        int[] vis=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0 && dfs(adj,vis,i)){
                return false;
            }
        }
        return true;
    }
}