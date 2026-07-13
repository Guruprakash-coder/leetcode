class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> nums=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=9;i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            int num=q.poll();

            int last=num%10;
            if(last<9){
                int next=num*10+last+1;
                nums.add(next);
                q.offer(next);
            }
            
        }
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            if (num >= low && num <= high) {
                ans.add(num);
            }
        }

        return ans;

    }
}