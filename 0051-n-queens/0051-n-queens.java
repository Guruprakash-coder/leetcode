class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] visited=new boolean[n][n];
        return helper(visited,0);
    }
    List<List<String>> helper(boolean[][] board,int n){
        
        if(n==board.length){
            List<List<String>> res = new ArrayList<>();
res.add(gene(board));
return res;
        }
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<board[0].length;i++){

            if(isSafe(board,n,i)){
                board[n][i]=true;
                ans.addAll(helper(board,n+1));
                board[n][i]=false;
            }
        }
        
        
            
        return ans;
    }
    boolean isSafe(boolean[][] board,int row ,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }
    List<String> gene(boolean[][] board){
        List<String> lst=new ArrayList<String>();
        
        for(boolean[] row: board){
            StringBuilder ans=new StringBuilder(4);
            for(boolean element:row){
                if(element){
                    ans.append('Q');
                }else{
                    ans.append('.');
                }
            }

            lst.add(ans.toString());
        }
        return lst;
    }
}