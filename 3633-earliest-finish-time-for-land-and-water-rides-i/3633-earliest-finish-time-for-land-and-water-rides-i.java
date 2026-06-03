class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        int WMIN=Integer.MAX_VALUE;
        int LMIN=Integer.MAX_VALUE;

        for(int i=0;i<landStartTime.length;i++){
            LMIN=Math.min(LMIN,landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<waterStartTime.length;i++){
            ans=Math.min(ans,Math.max(LMIN,waterStartTime[i])+waterDuration[i]);
        }
        for(int i=0;i<waterStartTime.length;i++){
            WMIN=Math.min(WMIN,waterStartTime[i]+waterDuration[i]);
        }
        for(int i=0;i<landStartTime.length;i++){
            ans=Math.min(ans,Math.max(WMIN,landStartTime[i])+landDuration[i]);
        }
        return ans;
    }
}