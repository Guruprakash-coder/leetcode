class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rep=sum(nums[i]);
            min=Math.min(min,rep);
            nums[i]=rep;
        }
        return min;
    }
    public int sum(int n){
        int a=0;
        while(n>0){
            a+=n%10;
            n=n/10;
        }
        return a;
    }
}