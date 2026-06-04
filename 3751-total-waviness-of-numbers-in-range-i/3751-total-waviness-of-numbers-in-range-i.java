class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=vawe(i);
        }
        return ans;
    }
    private int vawe(int x){
        String s=Integer.toString(x);
        int cnt=0;
        for(int i=1;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if((ch>s.charAt(i-1)&&ch>s.charAt(i+1)||(ch<s.charAt(i-1)&&ch<s.charAt(i+1)))){
                cnt++;
            }
        }
        return cnt;
    }
}