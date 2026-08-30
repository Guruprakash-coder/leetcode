class Solution {
    public int minimumDeletions(int[] nums) {
        int mini=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxi]){
                maxi=i;
            }
            if(nums[i]<nums[mini]){
                mini=i;
            }
        }
        int left=Math.min(mini,maxi);
        int right=Math.max(mini,maxi);

        int op1=right+1;
        int op2=nums.length-left;
        int op3=(left+1)+(nums.length-right);
        return Math.min(op1,Math.min(op2,op3));
    }
}