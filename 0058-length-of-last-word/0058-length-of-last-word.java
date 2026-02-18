class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean started=false;
        for(int i=s.length()-1;i>=0;i--){
            if(started==false && s.charAt(i)==' '){
                continue;
            }
            if(started==true && s.charAt(i)==' '){
                break;
            }
            count++;
            started=true;
        }
        return count;
        
    }
}