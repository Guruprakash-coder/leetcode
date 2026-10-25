class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        long cursum=nums[0];
        if(cursum<=0) return 0;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            cursum+=nums[i];
            if(cursum>0) ans++;
        }
        return ans;

    }
}