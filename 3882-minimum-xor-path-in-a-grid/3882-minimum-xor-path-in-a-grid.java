class Solution {
    int n;
    int m;
    private Set<Integer> f(int r,int c,int[][] grid,Set<Integer>[][] s){
        if(r>=n || c>=m || r<0 || c<0){
            return new HashSet<>();
        }
        if(r==0 && c==0){
            return s[0][0]= new HashSet<>(Set.of(grid[0][0]));
        }
        if(s[r][c]!=null){
            return s[r][c];
        }
        s[r][c]=new HashSet<>();
        Set<Integer> p=new HashSet<>();
        p.addAll(f(r-1,c,grid,s));
        p.addAll(f(r,c-1,grid,s));
        for(int k:p){
            s[r][c].add(k^grid[r][c]);
        }
        return s[r][c];
        
    }
    public int minCost(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        Set<Integer>[][] s=new HashSet[n][m];
        
        f(n-1,m-1,grid,s);
        return Collections.min(s[n - 1][m - 1]);
    }
}