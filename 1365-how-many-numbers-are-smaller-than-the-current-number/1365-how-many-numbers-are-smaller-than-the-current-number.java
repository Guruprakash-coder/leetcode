class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newarr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int track=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    track++;
                }
            }
            newarr[i]=track;
        }
        return newarr;
    }
}