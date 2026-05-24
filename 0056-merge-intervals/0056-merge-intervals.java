class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
         ArrayList<Integer> list=new ArrayList<>();
         int[] prev=intervals[0];
         for(int i=1;i<intervals.length;i++){
            if(prev[1]>=intervals[i][0]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }else{
                list.add(prev[0]);
                list.add(prev[1]);
                prev=intervals[i];
            }
         }
         list.add(prev[0]);
         list.add(prev[1]);
         int[][] ans=new int[list.size()/2][2];
         int row=0;
         for(int i=0;i<list.size();i+=2){
            ans[row][0]=list.get(i);
            ans[row][1]=list.get(i+1);
            row++;
         }
         return ans;
    }
}