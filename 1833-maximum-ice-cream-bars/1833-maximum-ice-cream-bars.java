class Solution {
    public int maxIceCream(int[] costs, int coins) {
       int max=costs[0];
       for(int cost:costs){
        max=Math.max(max,cost);
       }
       int[] count=new int[max+1];
       for(int cost:costs){
        count[cost]++;
       }
       int ind=0;
       for(int i=0;i<=max;i++){
        while(count[i]>0){
            costs[ind]=i;
            ind++;
            count[i]--;
        }
       }
       
       int cnt=0;
       for(int cost:costs){
        if(cost<=coins){
            cnt++;
            coins-=cost;
        }else{
            break;
        }
       }
       return cnt;
    }
}