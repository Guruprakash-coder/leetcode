class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] vis=new boolean[101];
        for(int num:nums) vis[num]=true;
        int last=0;
        for(int i=k;i<vis.length;i+=k){
            if(!vis[i]) return i;
            last=i;
        }
        return last+k;
    }
}