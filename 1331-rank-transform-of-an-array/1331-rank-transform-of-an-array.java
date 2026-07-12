class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sort=arr.clone();
        Arrays.sort(sort);
        Map<Integer,Integer> m=new HashMap<>();
        int rank=1;
        for(int x:sort){
            if(!m.containsKey(x)){
                m.put(x,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=m.get(arr[i]);
        }
        return arr;
    }
}