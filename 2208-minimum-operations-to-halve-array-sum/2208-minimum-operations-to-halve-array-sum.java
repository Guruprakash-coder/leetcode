class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int n:nums){
            pq.add((double)n);
            sum+=n;
        }
        

        double min=sum/2.0;
        
        int ans=0;
        double running=0;
        while(!pq.isEmpty()){
            if(sum-running<=min){
                break;
            }
            double n=pq.poll()/2.0;
            running+=n;
            ans++;
            pq.add(n);
            
        }
        return ans;

    }
}