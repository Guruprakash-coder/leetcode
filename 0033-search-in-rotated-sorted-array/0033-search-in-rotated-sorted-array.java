class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int pivot=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                pivot=mid;
                break;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                pivot=mid-1;
                break;
            }
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }else if(nums[mid]>nums[start]){
                start=mid+1;
            }
        }
        int fhalf=bSearch(nums,target,0,pivot);
        int shalf=bSearch(nums,target,pivot+1,nums.length-1);
        if(fhalf!=-1){
            return fhalf;
        }
        return shalf;
    }
    int bSearch(int[] nums,int target,int start,int end){
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
                break;
            }
            if(nums[mid]>target){
                end=mid-1;
            }else {
                
                start=mid+1;
            }
        }
        return ans;
    }
}