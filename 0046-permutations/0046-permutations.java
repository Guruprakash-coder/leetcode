class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<Integer>(),nums);
        return ans;
    }
    private void helper(List<List<Integer>> list,List<Integer> curr,int[] nums){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }else{
            for(int i=0;i<nums.length;i++){
                if(curr.contains(nums[i])) continue;
                curr.add(nums[i]);
                helper(list,curr,nums);
                curr.remove(curr.size()-1);
            }
        }

    }
}