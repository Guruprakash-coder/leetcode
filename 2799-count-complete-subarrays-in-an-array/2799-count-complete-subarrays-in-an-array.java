class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int n=set.size();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> curr=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                curr.add(nums[j]);
                if(n==curr.size()){
                    ans+=nums.length-j;
                    break;
                }
            }
        }
        return ans;
    }
   
}