class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int MOD = 1000000007;
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        int[] ans=new int[n];
        for(int i=0;i<k;i++){
            ans[0]=arr[0];
            for(int j=1;j<n;j++){
                ans[j]=(int)(((long)ans[j-1]+arr[j])%MOD);
            }
            for(int j=0;j<n;j++){
                arr[j]=ans[j];
            }
        }
        return ans[n-1];
    }
}