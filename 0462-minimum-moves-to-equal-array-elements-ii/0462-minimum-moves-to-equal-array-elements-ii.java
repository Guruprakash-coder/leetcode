class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int median=nums.length/2;
        for(int num:nums){
            ans+=Math.abs(nums[median]-num);
        }
        return ans;
    }
}