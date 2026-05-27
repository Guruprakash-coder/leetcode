class Solution {
    public boolean detectCapitalUse(String word) {
        int uc=0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch)){
                uc++;
            }
        }
        return uc==0 || uc==word.length() || (uc==1 && Character.isUpperCase(word.charAt(0)));
    }
}