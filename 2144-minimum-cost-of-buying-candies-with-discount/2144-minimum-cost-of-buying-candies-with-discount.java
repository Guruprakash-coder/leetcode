class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int sum=0;
        int iter=1;
        for(int j=cost.length-1;j>=0;j--){
            if(iter==3){
                iter=1;
                continue;
            }
            sum+=cost[j];
            iter++;
        }
        return sum;
    }
}