class Solution {
    public boolean isGood(int[] nums) {
        Set<Integer> s=new HashSet<>();
        boolean rep=false;
        for(int num:nums){
            if(num>nums.length-1){
                return false;
            }
            if(s.contains(num)){
                if(num<nums.length-1 || rep){
                    return false;
                }
                rep=true;
                continue;
            }
            s.add(num);
        }
        return true;
    }
}