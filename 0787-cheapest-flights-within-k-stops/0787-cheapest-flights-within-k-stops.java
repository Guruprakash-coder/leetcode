class Solution {
    class Pair{
        int node;
        int diff;
        Pair(int node,int diff){
            this.node=node;
            this.diff=diff;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj=new ArrayList<>();
        int m=flights.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        Queue<int[]> q=new LinkedList<>();
        int[] dists=new int[n];
        Arrays.fill(dists,Integer.MAX_VALUE);
        dists[src]=0;
        q.offer(new int[]{0,src,0});
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int stops=curr[0];
            int currnode=curr[1];
            int dist=curr[2];
            
            if(stops>k) continue;
            for(Pair p:adj.get(currnode)){
                int adjnode=p.node;
                int differ=p.diff;
                if(dist+differ < dists[adjnode] && stops<=k){
                    dists[adjnode]=dist+differ;
                    q.offer(new int[]{stops+1,adjnode,dist+differ});
                }
            }
        }
        
        return dists[dst]==Integer.MAX_VALUE?-1:dists[dst];

    }
}