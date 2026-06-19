class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,new ArrayList<Integer>(),nums,0);
        return ans;
    }
    private void helper(List<List<Integer>> list,List<Integer> curr,int[] nums,int ind){
        list.add(new ArrayList<>(curr));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            helper(list,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
    }
}