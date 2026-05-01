class Solution {
    public int residuePrefixes(String s) {
        int ans=0;
        char[] str=s.toCharArray();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length;i++){
            set.add(str[i]);
            if(set.size()==(i+1)%3){
                ans++;
            }
        }
        return ans;
    }
}