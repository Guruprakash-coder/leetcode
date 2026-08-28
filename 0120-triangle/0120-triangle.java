class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][];
        for(int i=0;i<triangle.size();i++){
            dp[i]=new int[triangle.get(i).size()];
        }
        for(int[] d:dp){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        return f(triangle,dp,0,0);
    }
    private int f(List<List<Integer>> triangle,int[][] dp,int r,int c){
        if(r==triangle.size()-1){
            return triangle.get(r).get(c);
        }
        if(dp[r][c]!=Integer.MAX_VALUE){
            return dp[r][c];
        }
        int down=f(triangle,dp,r+1,c)+triangle.get(r).get(c);
        int diag=f(triangle,dp,r+1,c+1)+triangle.get(r).get(c);

        return dp[r][c]=Math.min(down,diag);
    }
}