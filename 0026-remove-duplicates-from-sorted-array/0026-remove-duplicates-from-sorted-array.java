class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 ){
            return 0;
        }
       int i=0;
       int j=1;
       
       while(true){
        if(i>=nums.length || j>=nums.length){
            break;
        }
            if(nums[i]==nums[j]){
                j++;
            }else{
               
                nums[i+1]=nums[j];
                i++;
                j++;
            }
       }
    return i+1;

    }
}