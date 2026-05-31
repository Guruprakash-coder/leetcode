/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length() -1;
        
        while(start<end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        int peak=start;
        int fhalf=agbs(mountainArr,target,0,peak);
        int shalf=agbs(mountainArr,target,peak+1,mountainArr.length()-1);
        if(fhalf==-1 && shalf==-1){
            return -1;
        }
        if(fhalf<0){
            fhalf=Integer.MAX_VALUE;
        }
        if(shalf<0){
            shalf=Integer.MAX_VALUE;
        }
        if(fhalf<shalf){
            return fhalf;
        }else{
            return shalf;
        }

    }
    public int agbs(MountainArray arr,int target,int start,int end){
        boolean isAsc=arr.get(start)<arr.get(end);
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr.get(mid)){
                return mid;
            }
            if(isAsc){
                if(arr.get(mid)<target){
                    start=mid+1;
                }else {
                    
                    end=mid-1;
                }
            }
            else{
                 if(arr.get(mid)<target){
                    
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
  
        }
        return -1;
    }
}