class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]==n){
                i++;
            }else if(nums[i]<nums.length && nums[correct]!=nums[i]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
            
        }
        return nums.length;

    }
     static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}