class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int max=0;
        for(int right=-n+1;right<n;right++){
            for(int down=-n+1;down<n;down++){
                int cur=0;
                for(int row=0;row<n;row++){
                    for(int col=0;col<n;col++){
                        if(img1[row][col]==1){
                            int nr=row+down;
                            int nc=col+right;
                            if(nr>=0 && nr<n && nc>=0 && nc<n && img2[nr][nc]==1){
                                cur++;
                            }
                        }
                    }
                }
                max=Math.max(max,cur);
                
            }
        }
        return max;
    }
}