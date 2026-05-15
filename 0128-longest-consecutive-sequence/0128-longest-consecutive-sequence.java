class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int lon=1;
        int cur=1;
        System.out.print(Arrays.toString(nums));
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            if(nums[i-1]+1==nums[i]){
                cur++;
            }else{
                cur=1;
            }

            lon=Math.max(lon,cur);
        }
        return lon;
    }
}