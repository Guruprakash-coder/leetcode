class Solution {
    public int magicalString(int n) {
        if(n<=0){
            return 0;
        }
        StringBuilder sb=new StringBuilder("122");
        int cnt=0;
        int ptr=2;
        int num=1;
        while(sb.length()<n){
            char ch=sb.charAt(ptr);
            
            if(ch=='1'){
                sb.append(num);
                num=num==1?2:1;
            }else{

                sb.append(num);
                if(sb.length()<n){
                    sb.append(num);
                }
                
                num=num==1?2:1;
            }
            ptr++;
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                cnt++;
            }
        }
        System.out.print(sb);
        return cnt;
    }
}