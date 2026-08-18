class Solution {
    public int minimumEffortPath(int[][] height) {
        int[][] dist=new int[height.length][height[0].length];
        for(int[] dis:dist){
            Arrays.fill(dis,Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (x,y)->Integer.compare(x[0],y[0])
        );
        int[][] DIR={
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };
        pq.offer(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int r=curr[1];
            int c=curr[2];
            int curdis=curr[0];
            if(r==height.length-1 && c==height[0].length-1) return curdis;
            for(int[] d:DIR){
                int nr=curr[1]+d[0];
                int nc=curr[2]+d[1];
                if(nr>=0 && nr<height.length && nc>=0 && nc<height[0].length ){
                    int neweffort=Math.max(curdis,Math.abs(height[nr][nc]-height[r][c]));
                    if(neweffort<dist[nr][nc]){
                        dist[nr][nc]=neweffort;
                        pq.offer(new int[]{neweffort,nr,nc});
                    }
                }
            }
        }
        return 0;
    }
}