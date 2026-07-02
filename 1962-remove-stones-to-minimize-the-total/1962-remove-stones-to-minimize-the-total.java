class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for(int n:piles){
            pq.add(n);
            sum+=n;
        }
    
        for(int i=0;i<k;i++){
            
            int num=pq.poll();
            int rem=num/2;
            sum-=rem;
            pq.offer(num-rem);
            
        }
        return sum;

    }
}