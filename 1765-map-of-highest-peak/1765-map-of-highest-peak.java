class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int[][] DIR={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int n = isWater.length;
        int m = isWater[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    q.offer(new int[]{i,j});
                    isWater[i][j]=0;
                }else{
                    isWater[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int[] point=q.poll();
            int r=point[0];
            int c=point[1];
            
            for(int[] D:DIR){
                int nr=r+D[0];
                int nc=c+D[1];
                if(nr>=0 && nc>=0 && nr<n && nc<m && isWater[nr][nc]==-1){
                    isWater[nr][nc]=isWater[r][c]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return isWater;
    }
}