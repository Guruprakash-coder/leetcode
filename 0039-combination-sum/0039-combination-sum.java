class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<Integer>(),candidates,target,0);
        return ans;
    }
    private void helper(List<List<Integer>> list,List<Integer> curr,int[] nums,int rem,int s){
        if(rem<0){
            return ;
        }else if(rem==0){
            list.add(new ArrayList<>(curr));
            return;
        }else{
            for(int i=s;i<nums.length;i++){
                curr.add(nums[i]);
                helper(list,curr,nums,rem-nums[i],i);
                curr.remove(curr.size() - 1);
            }
        }

    }
}