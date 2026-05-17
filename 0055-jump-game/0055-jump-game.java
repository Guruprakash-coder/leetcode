class Solution {
    public boolean canJump(int[] nums) {
        return pos(nums,0);
    }
    boolean pos(int[] nums,int i){
        if(i>=nums.length || nums[i]==-1){
            return false;
        }
        if(i==nums.length-1){
            return true;
        }
        int n=nums[i];
        nums[i]=-1;
        boolean ans=false;
        for(int j=1;j<=n;j++){
            ans=pos(nums,i+j);
            if(ans){
                return true;
            }
        }
        return false;
    }
    
}