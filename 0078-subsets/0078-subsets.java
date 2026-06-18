class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<Integer>(),nums,0);
        return ans;
    }
    private void helper(List<List<Integer>> list,List<Integer> curr,int[] nums,int index){
        list.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            helper(list,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
    }
}