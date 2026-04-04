class Solution {
    public long maxProduct(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
               
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
               
                max2=nums[i];
            }

            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        long x = 100000;
        
        long case1 = (long) min1 * min2 * x;
        long case2 = (long) max1 * max2 * x;
        long case3 = (long) min1 * max1 * (-x);

        return Math.max(case1, Math.max(case2, case3));


    }
}