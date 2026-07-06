class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i]!=-1) continue;
            color[i]=0;
            q.offer(i);
            while(!q.isEmpty()){
            
            int node=q.poll();
            for(int neigh:graph[node]){
                
                if(color[neigh]!=-1){
                    if(color[neigh]==color[node]){
                        return false;
                    }
                    
                }else{
                    color[neigh]=color[node]==0?1:0;
                    q.offer(neigh);
                }
            }
        }
        }
        
        return true;
    }
}