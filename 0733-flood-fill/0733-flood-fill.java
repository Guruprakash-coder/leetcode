class Solution {
    private static int[][] DIR={
        {1,0}, {-1,0}, {0,1}, {0,-1}
    };
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int req=image[sr][sc];
        if(req==color){
            return image;
        }
        dfs(image,sr,sc,req,color);
        return image;
    }
    public void dfs(int[][] image,int r,int c,int req,int color){
        
        
        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c]!=req){
            return;
        }
        image[r][c]=color;
        for(int[] d:DIR){
            dfs(image,r+d[0],c+d[1],req,color);
        }
    }
}