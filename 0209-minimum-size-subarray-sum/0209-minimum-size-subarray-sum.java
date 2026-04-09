class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i=0;
        int j=1;
        int sum=nums[0];
        if(sum>=target){
            return 1;
        }
        int pieces=Integer.MAX_VALUE;
        while(j<nums.length){
            if(nums[j]>=target){
                return 1;
            }
            if(sum+nums[j]>=target){
                pieces=Math.min(pieces,j-i+1);
                
                sum=sum-nums[i];
                i++;
                continue;
            }else{
                sum+=nums[j];
            }
            j++;
            

        }
        if(pieces==Integer.MAX_VALUE){
            return 0;
        }
        return pieces;

    }

}