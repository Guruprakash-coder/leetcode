class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String r1=new String();
        String r2=new String();
        String c=new String();
        long volume=(long)length*width*height;
        if(volume>=Math.pow(10,9)||length>=Math.pow(10,4) || width>=Math.pow(10,4)||height>=Math.pow(10,4)){
            r1="bulky";
        }
        if(mass>=100){
            r2="heavy";
        }
        if(r1=="bulky" && r2=="heavy"){
            c="Both";
        }else if(r1=="bulky"){
            c="Bulky";
        }else if(r2=="heavy"){
            c="Heavy";
        }else{
            c="Neither";
        }
        return c;
    }
}