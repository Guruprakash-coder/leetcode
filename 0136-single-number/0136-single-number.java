class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
            if(nums[i]!=nums[i-1]){
                if(c==1){
                    return nums[i-1];
                }else{
                    c=1;
                }
            }
        }
        return nums[nums.length-1];
    }
}