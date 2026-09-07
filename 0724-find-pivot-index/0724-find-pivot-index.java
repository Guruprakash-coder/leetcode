class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                leftsum+=nums[i-1];
            }
            int rightsum=sum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }
}