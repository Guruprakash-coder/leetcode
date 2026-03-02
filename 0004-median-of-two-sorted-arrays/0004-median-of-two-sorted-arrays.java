class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] totarr=Merge(nums1,nums2);
        
        int n=totarr.length;
        if(n%2==0){
            return (totarr[n/2-1]+totarr[n/2])/2.0;
            
        }else{
            return totarr[n/2];
        }
        

    }

    public int[] Merge(int[] nums1,int[] nums2){
        int mix[]=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                mix[k]=nums1[i];
                i++;
            }else{
                mix[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            mix[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            mix[k]=nums2[j];
            k++;
            j++;
        }
        return mix;


    }
}