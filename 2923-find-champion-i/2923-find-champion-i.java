class Solution {
    public int findChampion(int[][] grid) {
        int[] sum=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                sum[i]+=grid[i][j];
            }
        }
        int ans=-1;
        int maxSum=-1;
        for(int k=0;k<sum.length;k++){
            if(sum[k]>maxSum){
                maxSum=sum[k];
                ans=k;
            }
        }
        return ans;
    }
}