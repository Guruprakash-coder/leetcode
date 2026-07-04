class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] DIR = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> q=new LinkedList<>();
        boolean[][] vis=new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    vis[i][j]=true;
                }
            }
        }
        while(!q.isEmpty()){
            int[] point=q.poll();
            int r=point[0];
            int c=point[1];
            int step=point[2];
            mat[r][c]=step;
            for(int[] D:DIR){
                int nr=r+D[0];
                int nc=c+D[1]; 
               if(nr>=0 && nc>=0 && nr<mat.length && nc<mat[0].length && !vis[nr][nc]){
                vis[nr][nc]=true;
                q.offer(new int[]{nr,nc,step+1});
               }
            }
        }
        return mat;
    }
}