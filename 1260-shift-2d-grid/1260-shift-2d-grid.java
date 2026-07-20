class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k=k%(grid.length*grid[0].length);
        for(int n=0;n<k;n++){
            int prev=grid[grid.length-1][grid[0].length-1];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    int temp=grid[i][j];
                    grid[i][j]=prev;
                    prev=temp;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> list = new ArrayList<>();
            for (int x : row) {
                list.add(x);
            }
            ans.add(list);
            }
        
        return ans;
    }
}