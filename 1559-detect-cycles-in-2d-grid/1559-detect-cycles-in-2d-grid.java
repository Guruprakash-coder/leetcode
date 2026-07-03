class Solution {
    private static final int[][] DIR = {
         {1,0} ,{-1,0},{0,1},{0,-1}
    };
    public boolean containsCycle(char[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j]){
                    if(bfs(i,j,grid,vis)) return true;
                }
            }
        }
        return false;
    }
    private boolean bfs(int r,int c,char[][] grid,boolean[][] vis){
        vis[r][c]=true;
        char ch=grid[r][c];
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{r,c,-1,-1});
        while(!q.isEmpty()){
            int[] nodes=q.poll();
            int[] curr={nodes[0],nodes[1]};
            int[] parent={nodes[2],nodes[3]};
            for(int[] D:DIR){
                int[] node={curr[0]+D[0],curr[1]+D[1],curr[0],curr[1]};
                if(node[0]<0 || node[1]<0 || node[0]>=grid.length || node[1]>=grid[0].length ){
                    continue;
                }
                if(grid[node[0]][node[1]]!=ch){
                    continue;
                }
                if(node[0]==parent[0] && node[1]==parent[1]){
                    continue;
                };
                if(vis[node[0]][node[1]]) return true;
                vis[node[0]][node[1]]=true;
                q.offer(node);
            }
        }
        return false;
    }
}