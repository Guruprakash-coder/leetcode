class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans,new ArrayList<Integer>(),candidates,target,0);
        return ans;

    }
    private void helper(List<List<Integer>> list,List<Integer> temp,int[] candidates,int rem,int idx){
        if(rem<0){
            return;
        }else if(rem==0){
            list.add(new ArrayList<>(temp));
            return;
        }else{
            for(int i=idx;i<candidates.length;i++){
                if(i>idx && candidates[i]==candidates[i-1]){
                    continue;
                }
                if(candidates[i]>rem){
                    return;
                }
                temp.add(candidates[i]);
                helper(list,temp,candidates,rem-candidates[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
