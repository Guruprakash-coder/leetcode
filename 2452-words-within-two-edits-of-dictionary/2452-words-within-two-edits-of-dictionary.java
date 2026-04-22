class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                int diff=0;

                for(int z=0;z<queries[i].length();z++){
                    if(queries[i].charAt(z)!=dictionary[j].charAt(z)){
                        diff++;
                        if(diff>2){
                            break;
                        }
                    }
                }
                if(diff<=2){
                    ans.add(queries[i]);
                    break;
                }
            }
        }

        return ans;
    }
}