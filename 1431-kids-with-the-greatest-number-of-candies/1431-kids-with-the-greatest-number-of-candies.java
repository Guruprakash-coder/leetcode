class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
            boolean m=true;
            for(int j=0;j<candies.length;j++){
                if((candies[i]+extraCandies)<candies[j]){
                    m=false;
                    break;
                }
            }
            list.add(m);
        }
        return list;
    }
}