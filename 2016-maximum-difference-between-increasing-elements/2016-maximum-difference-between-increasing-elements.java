class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            max=Math.max(max,nums[i]-min);
            
        }

        return max<=0?-1:max;

    }
}