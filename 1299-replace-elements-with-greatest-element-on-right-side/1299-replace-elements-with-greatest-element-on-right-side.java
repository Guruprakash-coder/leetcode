class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1){
            return new int[] {-1};
        }
        for(int i=0;i<arr.length-1;i++){
            arr[i]=findMax(arr,i+1);
        }
        arr[arr.length-1]=-1;
        return arr;
    }
    int findMax(int[] arr,int i){
        int max=Integer.MIN_VALUE;
        for(int n=i;n<arr.length;n++){
            max=Math.max(max,arr[n]);
        }
        return max;
    }
}