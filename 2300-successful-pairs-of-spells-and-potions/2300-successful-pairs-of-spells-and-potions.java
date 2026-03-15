class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int ans[]=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int cnt=0;
            int start=0;
            int end=potions.length-1;
            int pos=potions.length;
            while(start<=end){
                int mid=start+(end-start)/2;
                long val=(long)spells[i]*(long)potions[mid];
                if(val>=success){
                    pos=mid;
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            cnt+=potions.length-pos;
            ans[i]=cnt;
        }
        return ans;
    }
}