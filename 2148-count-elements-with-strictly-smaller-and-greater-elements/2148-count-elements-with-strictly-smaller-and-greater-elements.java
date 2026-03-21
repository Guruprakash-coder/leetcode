class Solution {
    public int countElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max || nums[i]==min){
                continue;
            }else{
                cnt++;
            }
        }
        return cnt;
    }
}