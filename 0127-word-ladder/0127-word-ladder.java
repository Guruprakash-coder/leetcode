class Solution {
    class Pair{
        String first;
        int lev;
        Pair(String first,int lev){
            this.first=first;
            this.lev=lev;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s=new HashSet<>();
        for(String st:wordList){
            s.add(st);            
        }
        s.remove(beginWord);
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        while(!q.isEmpty()){
            Pair node=q.poll();
            String word=node.first;
            int level=node.lev;
            if(word.equals(endWord)) return level;
            for(int i=0;i<word.length();i++){
                char[] charArray=word.toCharArray();
                char original=charArray[i];
                for(char ch='a';ch<='z';ch++){
                    if (ch == original) continue;
                    charArray[i]=ch;
                    String neww=new String(charArray);
                    if(s.contains(neww)){
                        q.offer(new Pair(neww,level+1));
                        s.remove(neww);
                    }
                }
                charArray[i]=original;
            }
        }
        return 0;
        
    }
}