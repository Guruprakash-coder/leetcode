class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans=0;
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=(long)nums[i];
            }
            if(nums[i]>max){
                max=(long)nums[i];
            }
        }
        ans=(long)((max-min)*k);
        return ans;
    }
}