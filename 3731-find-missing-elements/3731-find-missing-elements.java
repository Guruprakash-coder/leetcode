class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        Set<Integer> s=new HashSet<>();
        for(int x:nums){
            s.add(x);
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!s.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}