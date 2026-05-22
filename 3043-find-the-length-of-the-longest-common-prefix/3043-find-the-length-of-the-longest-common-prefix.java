class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr1){
            while(num>0){
                set.add(num);
                num=num/10;
            }
            
        }

        int ans=0;
        for(int num:arr2){
            while(num>0){
                if(set.contains(num)){
                    ans=Math.max(ans,length(num));
                    break;
                }
                num=num/10;
            }
        }
        return ans;

    }
    int length(int n){
         return String.valueOf(n).length();
    }
    
}