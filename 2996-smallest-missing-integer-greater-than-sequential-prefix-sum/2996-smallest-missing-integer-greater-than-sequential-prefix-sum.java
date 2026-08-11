class Solution {
    public int missingInteger(int[] nums) {
        boolean[] freq=new boolean[10000];
        for(int n:nums){
            freq[n]=true;
        }
        
        int sum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
               sum+=nums[i];
            }else{
                break;
            }
        }
        
        for(int i=sum;i<freq.length;i++){
            if(!freq[i]) return i;
        }
        return -1;
    }
}