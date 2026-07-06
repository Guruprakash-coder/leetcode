class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> {
            if(a[0]==b[0]){
                return Integer.compare(b[1],a[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int[] prev = {intervals[0][0], intervals[0][1]};
        int ans=1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=prev[0] && intervals[i][1]<=prev[1]){
                continue;
            }
            
            prev[1]=Math.max(prev[1],intervals[i][1]);
            
            ans++;
        }
        return ans;
    }
}