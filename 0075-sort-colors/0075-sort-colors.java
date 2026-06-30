class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
           if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=0;
            low++;
            nums[mid]=temp;
            mid++;
           }else if(nums[mid]==1){
            mid++;
           }else{
            int temp=nums[high];
            nums[mid]=temp;
            
            nums[high]=2;
            high--;
           } 
        }
    }
}