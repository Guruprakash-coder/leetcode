class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int up=0,down=n-1;
        int left=0,right=m-1;
        while(ans.size()<n*m){
            for(int i=left;ans.size()<n*m && i<=right;i++){
                ans.add(matrix[up][i]);
            }
            for(int i=up+1;ans.size()<n*m && i<=down;i++){
                ans.add(matrix[i][right]);
            }
            for(int i=right-1;ans.size()<n*m && i>=left;i--){
                ans.add(matrix[down][i]);
            }
            for(int i=down-1;ans.size()<n*m && i>up;i--){
                ans.add(matrix[i][left]);
            }
            up++;
            down--;
            left++;
            right--;
        }
        return ans;
    }
}