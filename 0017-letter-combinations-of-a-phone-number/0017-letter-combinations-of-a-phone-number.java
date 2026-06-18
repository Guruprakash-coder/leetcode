class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        helper(ans,new StringBuilder(),0,digits,map);
        return ans;
    }
    private void helper(List<String> ans,StringBuilder sb,int idx,String digits,HashMap<Integer,String> map){
        if(idx==digits.length()){
            ans.add(sb.toString());
            return ;
        }
        String letters=map.get(digits.charAt(idx)-'0');
        for(char ch:letters.toCharArray()){
            sb.append(ch);
            helper(ans,sb,idx+1,digits,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}