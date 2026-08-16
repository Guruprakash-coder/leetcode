class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;
       Queue<int[]> q=new LinkedList<>();
       grid[0][0]=1;
       q.offer(new int[] {0,0,1});
       int[][] Dir = {
            {0,1},
            {1,0},
            {0,-1}, 
            {-1,0},
            {1,1},
            {1,-1},
            {-1,1},
            {-1,-1}
        };
       ;
       while(!q.isEmpty()) {
        int[] node=q.poll();
        int r=node[0];
        int c=node[1];
        int dist=node[2];
        if(r==n-1 && c==m-1) return dist;
        
        for(int[] d:Dir){
            int nr=r+d[0];
            int nc=c+d[1];
            
            if(nc>=0 && nr>=0 && nc<m && nr<n && grid[nr][nc]==0){
                grid[nr][nc]=1;
                q.offer(new int[]{nr,nc,dist+1});
                

            }
        }
       }
       return -1;

    }
}