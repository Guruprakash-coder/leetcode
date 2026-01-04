class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int divcnt = 0;
            int sum = 0;
            int n = nums[i];

            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) {
                    if (j == n / j) {
                        divcnt++;
                        sum += j;
                    } else {
                        divcnt += 2;
                        sum += j + (n / j);
                    }

                    
                    if (divcnt > 4) break;
                }
            }

            if (divcnt == 4) {
                ans += sum;
            }
        }
        return ans;
    }
}
