class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i]>0){
                break;
            }
            
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int mid=nums[i]+nums[j]+nums[k];
                if(mid==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(mid<0){
                    j++;
                }else{
                    k--;
                }
            }
            
            

        }
        return ans;

    }
}