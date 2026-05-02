class Solution {
    public int rotatedDigits(int n) {
        if(n<=1)
        {
            return 0;
        }
        int ans=0;
        for(int i=2;i<=n;i++){
            if(isGood(i)){
                ans++;
            }
        }
        return ans;
    }boolean isGood(int n) {
    boolean changed = false;

    while (n > 0) {
        int d = n % 10;

        if (d == 3 || d == 4 || d == 7) {
            return false; 
        }

        if (d == 2 || d == 5 || d == 6 || d == 9) {
            changed = true;
        }

        n /= 10;
    }

    return changed;
}
}