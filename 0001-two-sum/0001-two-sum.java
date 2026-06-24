class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();  
      for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int need=target-n;
        
        if(map.containsKey(need)){
            return new int[] {map.get(need),i};
        }
        map.put(n,i);
      }
      return new int[] {};
    }
}