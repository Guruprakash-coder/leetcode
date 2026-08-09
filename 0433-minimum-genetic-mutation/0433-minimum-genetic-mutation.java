class Solution {
    class Pair{
        String first;
        int lev;
        Pair(String first,int lev){
            this.first=first;
            this.lev=lev;
        }
    }
    public int minMutation(String startGene, String endGene, String[] bank) {
        char[] choices = {'A', 'C', 'G', 'T'};
        Set<String> s=new HashSet<>();
        for(String st:bank){
            s.add(st);
        }
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(startGene,0));
        s.remove(startGene);
        while(!q.isEmpty()){
            Pair node=q.poll();
            String gen=node.first;
            int mut=node.lev;
            if(gen.equals(endGene)) return mut;
            for(int i=0;i<gen.length();i++){
                char[] charArray=gen.toCharArray();
                char orig=charArray[i];
                for(char ch:choices){
                    charArray[i]=ch;
                    String newg=new String(charArray);
                    if(s.contains(newg)){
                        q.offer(new Pair(newg,mut+1));
                        s.remove(newg);
                        
                    }
                }
                charArray[i]=orig;
            }
        }
        return -1;
    }
}