class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            if(sum(i)){
                c++;
            }
        }
        return c;
    }
    boolean sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum%2==0;
    }
}