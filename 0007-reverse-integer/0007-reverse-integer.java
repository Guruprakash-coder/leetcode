class Solution {
    public int reverse(int x) {
        long n=0;
        
        while(x!=0){
            int r=x%10;
            n=n*10+r;
            x=x/10;
        }
       
        
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE){
            return 0;
        }
        return (int)(n);
    }
}