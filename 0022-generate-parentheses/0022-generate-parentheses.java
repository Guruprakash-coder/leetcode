class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder cur=new StringBuilder();
        helper(ans,cur,n,n);
        return ans;
    }
    private void helper(List<String> ans,StringBuilder cur,int open,int close){
        if(open==0 && close==0){
            ans.add(cur.toString());
            return;
        }
        if(open>0){
            cur.append('(');
            helper(ans,cur,open-1,close);
            cur.deleteCharAt(cur.length()-1);
        }
        if(close>open){
            cur.append(')');
            helper(ans,cur,open,close-1);
            cur.deleteCharAt(cur.length()-1);
        }
    }
    
}