class Solution {
    public int[] runningSum(int[] nums) {
        int[] newarr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newarr[i]=runningsum(nums,i+1);
        }
        return newarr;
    }
    public int runningsum(int[] arr,int pos){
        int sum=0;
        for(int i=0;i<pos;i++){
            sum+=arr[i];
        }
        return sum;
    }
}