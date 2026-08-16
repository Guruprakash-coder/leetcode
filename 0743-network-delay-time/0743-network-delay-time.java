class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());
        for(int node[]:times){
            int u=node[0];
            int v=node[1];
            int w=node[2];
            adj.get(u).add(new int[]{v,w});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->Integer.compare(a[0],b[0])
        );
        pq.offer(new int[]{0,k});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int distan=curr[0];
            int node=curr[1];
            if(distan>dist[node]) continue;
            for(int[] it:adj.get(node)){
                int neigh=it[0];
                int weight=it[1];

                if(distan + weight < dist[neigh]){
                   dist[neigh] = distan + weight;
                    pq.offer(new int[]{dist[neigh], neigh});
                }
            }
        }
        int maxDist=0;
        for(int i=1;i<dist.length;i++){
            maxDist=Math.max(maxDist,dist[i]);
        }
        return maxDist==Integer.MAX_VALUE?-1:maxDist;

    }
}