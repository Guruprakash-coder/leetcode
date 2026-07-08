class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        perm(ans,new ArrayList<Integer>(),nums,new HashSet<Integer>());
        return ans;

    }
    private void perm(List<List<Integer>> ans,List<Integer>curr,int[] nums,Set<Integer> ind){
        if(curr.size()==nums.length){
            if(ans.contains(curr)){
                return;
            }
            ans.add(new ArrayList<>(curr));
            return;
        }else{
            for(int i=0;i<nums.length;i++){
                if(ind.contains(i)){
                    continue;
                }
                curr.add(nums[i]);
                ind.add(i);
                perm(ans,curr,nums,ind);
                curr.remove(curr.size()-1);
                ind.remove(i);
            }
        }

    }
}