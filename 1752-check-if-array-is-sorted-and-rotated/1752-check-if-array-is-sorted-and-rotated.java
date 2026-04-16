class Solution {
    public boolean check(int[] nums) {
        boolean marked=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                if(marked){
                    return false;
                }
                marked=true;
            }
        }
        if(marked && nums[0] < nums[nums.length - 1]) {
            return false;
        }

        return true;
    }
}