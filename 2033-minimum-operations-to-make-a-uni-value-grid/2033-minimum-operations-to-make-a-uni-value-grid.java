class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> nums=new ArrayList<>();
        int rem=grid[0][0]%x;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                nums.add(grid[i][j]);
                if(grid[i][j]%x!=rem){
                    return -1;
                }
            }
        }
        Collections.sort(nums);
        int mid=nums.get(nums.size()/2);
        int ans=0;
        for(int i=0;i<nums.size();i++){
            ans+=Math.abs(nums.get(i)-mid)/x;
        }
        return ans;
    }
}