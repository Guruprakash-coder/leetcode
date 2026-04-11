class Solution {
    public void moveZeroes(int[] nums) {
       int i=0;
       for(int j=0;j<nums.length;j++){
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }

       }
       
    }
    void swap(int[] nums,int f,int s){
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}