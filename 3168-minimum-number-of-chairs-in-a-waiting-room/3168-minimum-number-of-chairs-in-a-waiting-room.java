class Solution {
    public int minimumChairs(String s) {
        int sit=0;
        int chair=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
              if(chair==sit){
                chair++;
              } 
              sit++; 
                
            }else{
               sit--;
            }
        }
        return chair;
    }
}