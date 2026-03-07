class Solution {
    public int minOperations(String s) {
       int flip1=0;
        int flip2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)!='0'){
                    flip1++;
                }
                if(s.charAt(i)!='1'){
                    flip2++;
                }

            }else{
                if(s.charAt(i)!='0'){
                    flip2++;
                }
                if(s.charAt(i)!='1'){
                    flip1++;
                }
            }
        }
        if(flip1<flip2){
            return flip1;
        }
        return flip2;
    }
}