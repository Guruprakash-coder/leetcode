class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }

        int ans=0;
        for(int num:s){
            if(!s.contains(num-1)){
                int length=1;
                while(s.contains(num+length)){
                    length++;
                }
                ans=Math.max(ans,length);
            }

        }
        return ans;
    }
}