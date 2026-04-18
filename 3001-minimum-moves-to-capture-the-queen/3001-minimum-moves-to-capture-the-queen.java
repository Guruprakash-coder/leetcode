class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        
        // 🔹 Rook attack
        if (a == e) {
            if (!(c == a && between(b, d, f))) {
                return 1;
            }
        }
        
        if (b == f) {
            if (!(d == b && between(a, c, e))) {
                return 1;
            }
        }

        // 🔹 Bishop attack
        if (Math.abs(c - e) == Math.abs(d - f)) {
            if (!(Math.abs(a - c) == Math.abs(b - d) && 
                  Math.abs(a - e) == Math.abs(b - f) && 
                  between(c, a, e))) {
                return 1;
            }
        }

        return 2;
    }

    private boolean between(int start, int mid, int end) {
        return (mid > Math.min(start, end) && mid < Math.max(start, end));
    }
}