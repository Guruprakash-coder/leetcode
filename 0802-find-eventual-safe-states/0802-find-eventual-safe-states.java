class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] inDegree=new int[graph.length];
        List<List<Integer>> revadj=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int[] g:graph){
            revadj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            
            for(int neigh:graph[i]){
                revadj.get(neigh).add(i);
            }
            inDegree[i]+=graph[i].length;
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            
            for(int neigh:revadj.get(node)){
                if(--inDegree[neigh]==0) q.offer(neigh);
            }

        }
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                ans.add(i);
            }
        }
        
        return ans;

    }
}