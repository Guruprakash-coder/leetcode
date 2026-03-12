class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int pos=nums.length-1;
        int ans[]=new int[nums.length];
        while(i<=j){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];

            if(left>right){
                ans[pos]=left;
                i++;
            }else{
                ans[pos]=right;
                j--;
            }
            pos--;
        }
        
        return ans;
    }
}