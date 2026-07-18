class Solution {
    private boolean topo(List<List<Integer>> adj,int[] vis,int i,Stack<Integer> s){
        vis[i]=2;
        for(int neigh:adj.get(i)){
            if(vis[neigh]==2){
                return true;
            }else if(vis[neigh]==0){
                if(topo(adj,vis,neigh,s)) return true; ;
            }
        }
        vis[i]=1;
        s.push(i);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            adj.get(p[1]).add(p[0]);
        }
        Stack<Integer> s=new Stack<>();
        int[] vis=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(topo(adj,vis,i,s)) return new int[] {};
            } 
        }
        int i=0;
        int[] res=new int[numCourses];
        while(!s.isEmpty()){
            res[i++]=s.pop();
        }
        return res;
    }
}