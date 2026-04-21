class Solution {
    public boolean buddyStrings(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
             HashSet<Character> set = new HashSet<>();
             for(char ch : s1.toCharArray()){
                if(set.contains(ch)){
                    return true;
                }
                set.add(ch);
            }
            return false;
        }
        int first=-1;
        int second=-1;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(first==-1){
                    first=i;
                }else if(second==-1){
                    second=i;
                }else{
                    return false;
                }
            }
        }
        return second!=-1 && s1.charAt(first)==s2.charAt(second) && s2.charAt(first)==s1.charAt(second);
    }
}