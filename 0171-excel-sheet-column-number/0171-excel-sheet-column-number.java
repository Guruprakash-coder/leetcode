class Solution {
    public int titleToNumber(String columnTitle) {
        int i=columnTitle.length()-1;
        int mul=0;
        int ans=0;
        int cnt=0;
        while(i>=0){
            mul=(int)Math.pow(26,cnt);
            int a=columnTitle.charAt(i)-'A'+1;
            
            ans= ans+ (a *mul);
            i--;
            cnt++;
            
        }
        return ans;

    }
}