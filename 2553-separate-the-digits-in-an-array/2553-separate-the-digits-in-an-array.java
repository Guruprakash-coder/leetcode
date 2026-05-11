class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);

            for (char c:s.toCharArray()){
                ans.add(c-'0');
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;

    }
    
}