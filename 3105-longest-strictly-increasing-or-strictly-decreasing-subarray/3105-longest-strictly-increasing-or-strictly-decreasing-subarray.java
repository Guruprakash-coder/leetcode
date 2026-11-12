class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int SI=1;
        int SD=1;
        int prev=nums[0];
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>prev){
                temp++;
            }else{
                temp=1;
            }
            prev=nums[i];
            SI=Math.max(SI,temp);
        }
        prev=nums[0];
        temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<prev){
                temp++;
            }else{
                temp=1;
            }
            prev=nums[i];
            SI=Math.max(SI,temp);
        }

        return Math.max(SI,SD);
    }
}