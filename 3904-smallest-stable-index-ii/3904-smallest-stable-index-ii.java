class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxar=new int[nums.length];
        int[] minar=new int[nums.length];
        int max=nums[0];
        int min=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            maxar[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            minar[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            if(maxar[i]-minar[i]<=k){
                return i;
            }
        }
        return -1;
    }
}