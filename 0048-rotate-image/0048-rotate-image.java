class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans=RotNindegree(matrix);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
    public int[][] RotNindegree(int[][] mat){
        int[][] ans=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[i][j]=mat[mat.length-j-1][i];
            }
        }
        return ans;
    }
}