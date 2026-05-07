class Solution {
    public int[] transformArray(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                x++;
            }else{
                y++;
            }
        }
        for(int i=0;i<x;i++){
            nums[i]=0;
        }
        for(int i=x;i<nums.length;i++){
            nums[i]=1;
        }
        return nums;
    }
}