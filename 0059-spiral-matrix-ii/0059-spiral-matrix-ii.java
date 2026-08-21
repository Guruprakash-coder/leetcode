class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int num=1;
        int up=0;
        int down=n-1;
        int left=0;
        int right=n-1;
        while(up<=down && left<=right){
            for(int i=left;i<=right;i++){
                ans[up][i]=num++;
            }
            for(int i=up+1;i<=down;i++){
                ans[i][right]=num++;
            }
            for(int i=right-1;i>=left;i--){
                ans[down][i]=num++;
            }
            for(int i=down-1;i>up;i--){
                ans[i][left]=num++;
            }
            up++;
            down--;
            right--;
            left++;
        }
        return ans;
    }
}