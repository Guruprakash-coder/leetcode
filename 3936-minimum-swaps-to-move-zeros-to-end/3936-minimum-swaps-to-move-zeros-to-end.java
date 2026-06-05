class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(j>=0 && nums[j]==0){
            j--;
        }
        int cnt=0;
        while(i<j){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
                while(j>i && nums[j]==0){
                    j--;
                }
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}