class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int d[]:dp){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int up=dp[i-1][j]+matrix[i][j];
                int leftd=j!=0?dp[i-1][j-1]+matrix[i][j]:Integer.MAX_VALUE;
                int rightd=j!=matrix.length-1?dp[i-1][j+1]+matrix[i][j]:Integer.MAX_VALUE;
                dp[i][j]=Math.min(up,Math.min(leftd,rightd));
            }
        }
        for(int i=0;i<matrix.length;i++){
            ans=Math.min(ans,dp[matrix.length-1][i]);
        }
        return ans;
    }
    // public int minFallingPathSum(int[][] matrix) {
    //     int[][] dp=new int[matrix.length][matrix[0].length];
    //     for(int d[]:dp){
    //         Arrays.fill(d,Integer.MAX_VALUE);
    //     }
    //     int ans=Integer.MAX_VALUE;
    //     for(int i=0;i<matrix[0].length;i++){
    //         int mini=f(matrix,dp,matrix.length-1,i);
    //         ans=Math.min(mini,ans);
    //     }
    //     return ans;
    // }
    // private int f(int[][] matrix,int[][] dp,int r,int c){
    //     if(r<0 || c<0 || r>=matrix.length || c>=matrix[0].length){
    //         return Integer.MAX_VALUE/2;
    //     }
    //     if(r==0){
    //         return matrix[r][c];
    //     }
    //     if(dp[r][c]!=Integer.MAX_VALUE){
    //         return dp[r][c];
    //     }
    //     int leftd=f(matrix,dp,r-1,c-1)+matrix[r][c];
    //     int up=f(matrix,dp,r-1,c)+matrix[r][c];
    //     int rightd=f(matrix,dp,r-1,c+1)+matrix[r][c];
        
    //     return dp[r][c]=Math.min(leftd,Math.min(up,rightd));
    // }
}