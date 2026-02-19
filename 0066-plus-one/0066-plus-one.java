class Solution {
    public int[] plusOne(int[] digits) {
        boolean alln=true;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){
                alln=false;
                break;
            }
        }
        if(alln){
            int[] dignew=new int[digits.length+1];
            dignew[0]=1;
            for(int i=1;i<dignew.length-2;i++){
                dignew[i]=0;
            }
            return dignew;
        }
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        
        for(int i=digits.length-1;i>=0;i--){
             if(digits[i]==9){
                digits[i]=0;
             }else{
                 digits[i]=digits[i]+1;
                 break;
             }
            

        }
        return digits;

    }
}