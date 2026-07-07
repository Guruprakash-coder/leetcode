class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        int sum=0;

        for(char ch:String.valueOf(n).toCharArray()){
            if(ch!='0'){
                ans=ans*10+ch-'0';
                sum+=ch-'0';
            }
        }
        return ans*sum;
    }
}