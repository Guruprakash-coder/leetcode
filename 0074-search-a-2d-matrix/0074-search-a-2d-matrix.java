class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] ans=search(matrix,target);
        if(ans[0]==-1){
            return false;
        }
        return true;
    }
    int[] search(int[][] matrix ,int target){
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==1){
            return Bsearch(matrix,0,0,col-1,target);
        }
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        while(rStart<rEnd-1){
            int mid=(rStart+rEnd)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]>target){
                rEnd=mid;
            }else{
                rStart=mid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        if(cMid - 1 >= 0 && target<=matrix[rStart][cMid-1]){
            return Bsearch(matrix,rStart,0,cMid-1,target);
        }
        if(cMid + 1 < col && target>=matrix[rStart][cMid+1]&& target<=matrix[rStart][col-1]){
            return Bsearch(matrix,rStart,cMid+1,col-1,target);
        }
        if(cMid - 1 >= 0 && target<=matrix[rStart+1][cMid-1]){
            return Bsearch(matrix,rStart+1,0,cMid-1,target);
        }
        if(cMid + 1 < col && target>=matrix[rStart+1][cMid+1]&& target<=matrix[rStart+1][col-1]){
            return Bsearch(matrix,rStart+1,cMid+1,col-1,target);
        }
        return new int[]{-1,-1};

    }
    int[] Bsearch(int[][] matrix,int row,int cStart,int cEnd,int target ){
        while(cStart<=cEnd){
            int mid=(cStart+cEnd)/2;
            if(matrix[row][mid]==target){
            return new int[]{row,mid};
        }
        else if(matrix[row][mid]>target){
            cEnd=mid-1;
        }else{
            cStart=mid+1;
        }
        }
        
        return new int[] {-1,-1};
    }
}