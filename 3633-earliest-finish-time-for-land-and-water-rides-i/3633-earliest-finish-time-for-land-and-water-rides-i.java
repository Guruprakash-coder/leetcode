class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int t=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                ans=Math.min(ans,Math.max(t,waterStartTime[j])+waterDuration[j]);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            int t=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<landStartTime.length;j++){
                ans=Math.min(ans,Math.max(t,landStartTime[j])+landDuration[j]);
            }
        }
        return ans;
    }
}