class Solution {
    public int countElements(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i+1]==nums[i]){
                i++;
            }
            if(nums[j-1]==nums[j]){
                j--;
            }
            if(nums[j]>nums[j-1] && nums[i+1]>nums[i]){
                break;
            }
        }
        if(i>=j){
            return 0;
        }
        
        return nums.length-i-1-(nums.length-j);
    }
}