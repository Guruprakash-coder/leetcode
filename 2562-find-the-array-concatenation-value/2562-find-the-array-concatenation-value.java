class Solution {
    static{
        for(int i=0;i<300;i++){
            findTheArrayConcVal(new int[1]);
        }
        
    }
    public static long findTheArrayConcVal(int[] nums) {
        System.gc();
        int i=0;
        int j=nums.length-1;
        long ans=0;
        while(i<=j){
            if(i==j){
                ans+=nums[j];
                break;
            }
            String num=String.valueOf(nums[i]) + String.valueOf(nums[j]);
            ans+=Long.parseLong(num);
            i++;
            j--;
        }
        return ans;
    }
}