class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;

        StringBuilder sb = new StringBuilder("122");
        int ptr = 2;
        int num = 1;

        while (sb.length() < n) {
            int count = sb.charAt(ptr) - '0';

            for (int i = 0; i < count && sb.length() < n; i++) {
                sb.append(num);
            }

            num = (num == 1) ? 2 : 1;
            ptr++;
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) == '1') cnt++;
        }

        return cnt;
    }
}