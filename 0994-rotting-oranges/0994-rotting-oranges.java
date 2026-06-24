class Solution {
    private static final int[][] DIR = {
         {1,0} ,{-1,0},{0,1},{0,-1}
    };
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[] {i,j});
                    
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        if(q.isEmpty()){
            return -1;
        }
        int min=-1;
        
        while(!q.isEmpty()){
            
            int level=q.size();
            for(int i=0;i<level;i++){
                int[] curr=q.poll();
                for(int[] d:DIR){
                    int nr=curr[0]+d[0];
                    int nc=curr[1]+d[1];

                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
            min++;
        }
        if(fresh==0){
            return min;
        }

        return -1;

    }
}