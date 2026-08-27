class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dist=new int[n][m];
        for(int[] d:dist){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        dist[0][0]=grid[0][0];
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (x,y)->Integer.compare(x[0],y[0])
        );
        pq.offer(new int[]{grid[0][0],0,0});
        while(!pq.isEmpty()){
            int[] node=pq.poll();
            int curdis=node[0];
            int r=node[1];
            int c=node[2];
            if(r!=n-1){
                if(curdis+grid[r+1][c] < dist[r+1][c]){
                    dist[r+1][c]=curdis+grid[r+1][c];
                    pq.offer(new int[]{curdis+grid[r+1][c],r+1,c});
                }
            }
            if(c!=m-1){
                if(curdis+grid[r][c+1] < dist[r][c+1]){
                    dist[r][c+1]=curdis+grid[r][c+1];
                    pq.offer(new int[]{curdis+grid[r][c+1],r,c+1});
                }
            }
        }
        return dist[n-1][m-1];
    }
}