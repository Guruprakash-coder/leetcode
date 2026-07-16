class Solution {
    public long gcdSum(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gcd(nums[i],max);
            
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        long ans=0;

        while(i<j){
            ans+=gcd(nums[i],nums[j]);
            i++;
            j--;
        }
        return ans;
    }
    private int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
}