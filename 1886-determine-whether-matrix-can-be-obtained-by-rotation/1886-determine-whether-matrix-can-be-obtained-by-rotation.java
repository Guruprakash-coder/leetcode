class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i=0;i<4;i++){
            mat=RotNindegree(mat);
            if(areEqual(mat,target)){
                return true;
            }
        }


        return false;
    }
    public boolean areEqual(int[][] mat, int[][] target) {
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[i][j] != target[i][j]) return false;
        }
    }
    return true;
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