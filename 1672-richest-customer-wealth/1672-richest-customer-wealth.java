class Solution {
    public int maximumWealth(int[][] accounts) {

        int[] sum=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            
            for(int j=0;j<accounts[i].length;j++){
                sum[i]+=accounts[i][j];
            }
        }
        int maxsum=sum[0];
        for(int i=0;i<sum.length;i++){
            
            if(sum[i]>maxsum){
                maxsum=sum[i];
            }
        }
        return maxsum;
    }
}