class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(0);
            }else{
                int f=st.pop();
                int se=st.pop();
                st.push(se+Math.max(2*f,1));
            }
        }
        return st.pop();
    }
}