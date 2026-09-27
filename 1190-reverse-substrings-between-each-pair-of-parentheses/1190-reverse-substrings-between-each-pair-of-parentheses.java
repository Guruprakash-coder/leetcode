class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty() && ch!='('){
                ans.append(ch);
            }else{
                if(ch==')'){
                    StringBuilder rev=new StringBuilder();
                    while(st.peek()!='('){
                        char chu=st.pop();
                        rev.append(chu);
                    }
                    st.pop();
                    //rev.reverse();
                    if(st.isEmpty()){
                        ans.append(rev);
                        continue;
                    }
                    for (int z = 0; z < rev.length(); z++) {
                        st.push(rev.charAt(z));
                    }
                }else{
                    st.push(ch);
                }
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}