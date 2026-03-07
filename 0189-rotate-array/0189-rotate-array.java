class Solution {
    public void rotate(int[] nums, int k) {
        k=k% nums.length;
        int j=0;
        int[] ans=new int[nums.length];
        
        for(int i=nums.length-k;i<nums.length;i++){
            ans[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            ans[j]=nums[i];
            j++;
        }
        System.arraycopy(ans, 0, nums, 0, nums.length);
    }
}