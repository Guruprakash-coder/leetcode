class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }  
        return count;  
    }

    boolean even(int num){
        int digits=0;
        while(num!=0){
            digits++;
            num=num/10;
        }
        if(digits%2==0){
            return true;
        }
        return false;
    }

}