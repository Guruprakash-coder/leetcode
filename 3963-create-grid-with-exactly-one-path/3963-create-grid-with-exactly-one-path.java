class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
        String text=".";
        text+=("#".repeat(n-1));
        
        for (int i = 0; i < m - 1; i++) {
            ans[i] = text;
        }
        ans[m-1]=".".repeat(n);
        
        return ans;
        
    }
}