class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->Integer.compare((b[1] - b[0]),(a[1] - a[0])));
        long ans=0;
        long curr=0;
        for(int[] pair:tasks){
            int act=pair[0];
            int min=pair[1];

            if(curr<min){
                ans+=(min-curr);
                curr=min;
            }
            curr-=act;
        }
        return (int)ans;
    }
}