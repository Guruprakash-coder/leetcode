class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[nums1.length];
        ans=merge(nums1,nums2,m,n);
        
        
        System.arraycopy(ans, 0, nums1, 0, ans.length);
    }
     
    public int[] merge(int[] left,int[] right,int m,int n){
        int[] mix=new int[left.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;

            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<n){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}