class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        Set<Character> s=new HashSet<>();
        for(char ch:word.toCharArray()){
            s.add(ch);
        }
        for(char ch='a';ch<='z';ch++){
            
            if(s.contains(ch) && s.contains((char)(ch-32))){
                count++;
            }
        }
        return count;
    }
}