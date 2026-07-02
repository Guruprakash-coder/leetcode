class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int n:nums){
            pq.add(n);
        }
        long ans=0;
        while(k-- >0){
            int num=pq.poll();
            ans+=num;
            pq.offer((num%3==0?num/3:num/3+1));
        }
        return ans;
    }
}