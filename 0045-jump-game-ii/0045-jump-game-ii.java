class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int end=0;
        int limit=0;
        for(int i=0;i<nums.length-1;i++){
            limit=Math.max(limit,nums[i]+i);

            if(i==end){
                jumps++;
                end=limit;
            }
        }
        return jumps;
    }
}