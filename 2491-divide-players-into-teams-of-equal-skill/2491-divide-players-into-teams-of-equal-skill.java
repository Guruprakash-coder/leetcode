class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        long ans=0;
        int elig=skill[i]+skill[j];
        while(i<j){
            if(skill[i]+skill[j]!=elig){
                return -1;
            }else{
                ans+=skill[i]*skill[j];
                i++;
                j--;
            }
        }
        return ans;
    }
}