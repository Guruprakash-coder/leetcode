class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days={
            31,28,31,30,31,30,31,31,30,31,30,31
        };
        int maxarr=Math.max(today(arriveAlice,days),today(arriveBob,days));
        int minlea=Math.min(today(leaveAlice,days),today(leaveBob,days));
        return Math.max(0,minlea-maxarr+1);
        
    }
    private int today(String date,int[] days){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        int val=0;
        for(int i=0;i<month-1;i++){
            val+=days[i];
        }
        return val+day;

    }
}