class Solution {
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            adj.get(p[1]).add(p[0]);
        }
        int[] inDegree=new int[adj.size()];
        for(int i=0;i<adj.size();i++){
            for(int it:adj.get(i)){
                inDegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0) q.offer(i);
        }
        int[] res=new int[adj.size()];
        int i=0;
        while(!q.isEmpty()){
            int node=q.poll();
            res[i++]=node;
            for(int it:adj.get(node)){
                inDegree[it]--;
                if(inDegree[it]==0){
                    q.offer(it);
                }
            }
        }
        if(i!=adj.size()) return new int[] {};
        return res;

    }
}