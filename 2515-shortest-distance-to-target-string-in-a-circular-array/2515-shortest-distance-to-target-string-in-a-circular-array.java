class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int l=words.length;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[(i+startIndex)%l].equals(target)){
                min1=Math.min(i,min1);
            }
            if(words[(startIndex-i+l)%l].equals(target)){
                min2=Math.min(i,min2);
            }
        }
        
        return Math.min(min1,min2)==Integer.MAX_VALUE?-1:Math.min(min1,min2);
    }
}