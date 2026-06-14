class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.offer(num);
        }
        
        int n=0;
        for(int i=0;i<k;i++){
            n=pq.poll();
        }
        return n;
    }
}