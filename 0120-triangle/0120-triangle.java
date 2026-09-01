class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][];
        for(int i=0;i<triangle.size();i++){
            dp[i]=new int[triangle.get(i).size()];
        }
        for(int i=0;i<dp[dp.length-1].length;i++){
            dp[dp.length-1][i]=triangle.get(triangle.size()-1).get(i);
        }
        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[i].length-1;j>=0;j--){
                int curr=triangle.get(i).get(j);
                dp[i][j]=Math.min(dp[i+1][j]+curr,dp[i+1][j+1]+curr);
            }
        }



        return dp[0][0];
    }
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int[][] dp=new int[triangle.size()][];
    //     for(int i=0;i<triangle.size();i++){
    //         dp[i]=new int[triangle.get(i).size()];
    //     }
    //     for(int[] d:dp){
    //         Arrays.fill(d,Integer.MAX_VALUE);
    //     }
    //     return f(triangle,dp,0,0);
    // }
    // private int f(List<List<Integer>> triangle,int[][] dp,int r,int c){
    //     if(r==triangle.size()-1){
    //         return triangle.get(r).get(c);
    //     }
    //     if(dp[r][c]!=Integer.MAX_VALUE){
    //         return dp[r][c];
    //     }
    //     int down=f(triangle,dp,r+1,c)+triangle.get(r).get(c);
    //     int diag=f(triangle,dp,r+1,c+1)+triangle.get(r).get(c);

    //     return dp[r][c]=Math.min(down,diag);
    // }
}