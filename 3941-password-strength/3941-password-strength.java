class Solution {
    public int passwordStrength(String password) {
        int ans=0;;
        HashSet<Character> set=new HashSet<>();
        for(char ch:password.toCharArray()){
            set.add(ch);
        }
        for(char ch : set){
            
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    ans+=2;
                }else{
                    ans++;
                }
            }else if(Character.isDigit(ch)){
                ans+=3;
            }else{
                ans+=5;
            }
        }
        return ans;
    }
}