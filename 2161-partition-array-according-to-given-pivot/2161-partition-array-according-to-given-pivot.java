class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less=new ArrayList<>();
        ArrayList<Integer> high=new ArrayList<>();
        int piv=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                piv++;
            }else if(nums[i]<pivot){
                less.add(nums[i]);
            }else{
                high.add(nums[i]);
            }
        }
        int[] ans=new int[nums.length];
        int k=0;
        for(int i=0;i<less.size();i++){
            ans[k]=less.get(i);
            k++;
        }
        
        for(int i=0;i<piv;i++){
            ans[k]=pivot;
            k++;
        }
        for(int i=0;i<high.size();i++){
            ans[k]=high.get(i);
            k++;
        }
        return ans;
    }
}