class Solution {
    public String digitSum(String s, int k) {
        StringBuilder ans=new StringBuilder(s);
        while(ans.length()>k){
            StringBuilder nsb=new StringBuilder();
            for(int i=0;i<ans.length();i+=k){
                int v=0;
                int end=Math.min(i+k,ans.length());
                for (int j = i; j < end; j++) {
                    v += ans.charAt(j) - '0';
                }
                nsb.append(v);
            }
            ans=nsb;
        }
        return ans.toString();
    }
}