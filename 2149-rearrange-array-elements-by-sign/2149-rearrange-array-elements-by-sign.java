class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int num:nums){
            if(num<0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }
        int k=0;
        for(int i=0;i<nums.length/2;i++){
            
            nums[k]=pos.get(i);
            k++;
            nums[k]=neg.get(i);
            k++;

        }
        return nums;

    }
}