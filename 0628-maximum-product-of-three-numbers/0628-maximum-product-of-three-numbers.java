class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n=nums.length-1;
            
        int o1=nums[n]*nums[n-1]*nums[n-2];
        int o2=nums[0]*nums[1]*nums[n];
        
        return Math.max(o1,o2);
    }
}