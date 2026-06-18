class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<Integer>(),1,n,k);
        return ans;
    }
    private void helper(List<List<Integer>> ans,List<Integer> curr,int num,int n,int k){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return; 
        }

        for(int i=num;i<=n;i++){
            curr.add(i);
            helper(ans,curr,i+1,n,k);
            curr.remove(curr.size()-1);
        }
    }
}