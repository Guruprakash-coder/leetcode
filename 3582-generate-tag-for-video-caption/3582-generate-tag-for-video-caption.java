class Solution {
    public String generateTag(String caption) {
        
        StringBuilder ans = new StringBuilder();
        ans.append('#');
        int cnt=1;
        boolean firstover=false;
        boolean capitalizeNext = false;
        
        for(int i = 0; i < caption.length(); i++){
            
            if(cnt==100){
                break;
            }
            char c = caption.charAt(i);
            
            if(c == ' '){
                if(firstover){
                    capitalizeNext = true;
                    continue;  
                }else{
                    capitalizeNext=false;
                    continue;
                }

                
            }
            
            if(capitalizeNext){
                ans.append(Character.toUpperCase(c));
                capitalizeNext = false;
                if(!firstover){
                    firstover=true;
                }
                cnt++;
            } else {
                ans.append(Character.toLowerCase(c));
                if(!firstover){
                    firstover=true;
                }
                cnt++;
            }
            
        }
        
        return ans.toString();
    }
}