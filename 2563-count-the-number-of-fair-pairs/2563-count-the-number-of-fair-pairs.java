class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
       Arrays.sort(nums);
        return countLessEqual(nums,upper)-countLessEqual(nums,lower-1);
    }

    public long countLessEqual(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        long cnt=0;
        while(left<right){
            if(nums[right]+nums[left]<=target){
                cnt+=(right-left);
                left++;
            }else{
                right--;
            }
        }
        return cnt;
    }
}