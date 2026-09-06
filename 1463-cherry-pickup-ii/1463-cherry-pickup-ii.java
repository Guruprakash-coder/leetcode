class Solution {
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][][] dp=new int[r][c][c];
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                dp[r-1][i][j]=i==j?grid[r-1][j]:grid[r-1][i]+grid[r-1][j];
            }
        }
        for(int i=r-2;i>=0;i--){
            for(int j1=0;j1<c;j1++){
                for(int j2=0;j2<c;j2++){
                    int maxi=Integer.MIN_VALUE;
                    for(int dj1=-1;dj1<=1;dj1++){
                        for(int dj2=-1;dj2<=1;dj2++){
                            if(j1+dj1 <0 || j1+dj1>=c || j2+dj2<0 || j2+dj2>=c){
                                continue;
                            }
                            int value=j1==j2?grid[i][j1]:grid[i][j1]+grid[i][j2];
                            value+=dp[i+1][j1+dj1][j2+dj2];
                            maxi=Math.max(maxi,value);
                        }
                    }
                    dp[i][j1][j2]=maxi;
                }
            }
        }

        return dp[0][0][c-1];
    }
    // public int cherryPickup(int[][] grid) {
    //     int r=grid.length;
    //     int c=grid[0].length;
    //     int[][][] dp=new int[r][c][c];
    //     for(int[][] dp2:dp){
    //         for(int[] d:dp2){
    //             Arrays.fill(d,-1);
    //         }
    //     }
    //     return f(grid,0,0,grid[0].length-1,dp);
    // }
    // private int f(int[][] grid,int i,int j1,int j2,int[][][] dp){
    //     if(j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length){
    //         return Integer.MIN_VALUE/2;
    //     }
    //     if(i==grid.length-1){
    //         if(j1==j2){
    //             return grid[i][j1];
    //         }else{
    //             return grid[i][j1]+ grid[i][j2];
    //         }
    //     }
    //     if(dp[i][j1][j2]!=-1){
    //         return dp[i][j1][j2];
    //     }
    //     int maxi=Integer.MIN_VALUE;
    //     for(int in=-1;in<=1;in++){
    //         for(int j=-1;j<=1;j++){
    //             int value=j1==j2?grid[i][j1]:grid[i][j1]+grid[i][j2];
    //             maxi=Math.max(maxi,f(grid,i+1,j1+in,j2+j,dp)+value);
    //         }
    //     }
    //     return dp[i][j1][j2]=maxi;
    // }
}