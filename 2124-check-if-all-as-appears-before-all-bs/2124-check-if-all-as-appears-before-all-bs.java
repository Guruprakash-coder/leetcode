class Solution {
    public boolean checkString(String s) {
        boolean visited=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && visited){
                return false;
            }
            if(s.charAt(i)=='b'){
                visited=true;
            }
        }
        return true;
    }
}