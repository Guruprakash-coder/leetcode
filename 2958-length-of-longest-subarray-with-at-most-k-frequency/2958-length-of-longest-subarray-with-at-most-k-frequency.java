class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int i=0;
        int j=0;
        Map<Integer,Integer> m=new HashMap<>();
        while(j<nums.length){
            m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            while(m.get(nums[j])>k){
                m.put(nums[i],m.get(nums[i])-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}