class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans = new StringBuilder();

        Map<String, String> m = new HashMap<>();
        for (List<String> k : knowledge) {
            m.put(k.get(0), k.get(1));
        }

        Stack<Character> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == ')') {
                st.push(ch);
            } 
            else if (st.isEmpty()) {
                ans.insert(0, ch);
            } 
            else if (ch == '(') {
                StringBuilder curr = new StringBuilder();

                while (st.peek() != ')') {
                    curr.append(st.pop());
                }
                st.pop(); 
                if (m.containsKey(curr.toString())) {
                    ans.insert(0, m.get(curr.toString()));
                } else {
                    ans.insert(0, '?');
                }
            }else{
                st.push(ch);
            }
        }

        return ans.toString();
    }
}