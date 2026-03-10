class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int current=Math.min(height[i],height[j])*(j-i);
            if(max<current){
                max=current;
            }
            System.out.println(max);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            
        }
        
        return max;
    }
}