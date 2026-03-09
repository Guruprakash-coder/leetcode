class Solution {
    public int compress(char[] chars) {
        StringBuilder compressed=new StringBuilder();
        int cnt=1;
        char prev=chars[0];
        for(int i=1;i<chars.length;i++){
            if(prev==chars[i]){
                cnt++;
            }
            if(prev!=chars[i]){
                compressed.append(prev);
                if(cnt!=1){
                    compressed.append(cnt);
                }
                prev=chars[i];
                cnt=1;
            }
        }
        
        compressed.append(prev);
        if(cnt!=1){
            compressed.append(cnt);
        }
        System.out.print(compressed);
        for(int i = 0; i < compressed.length(); i++){
            chars[i] = compressed.charAt(i);
        }
        return compressed.length();
    }
}