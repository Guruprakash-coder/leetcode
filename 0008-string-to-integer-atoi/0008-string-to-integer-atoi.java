class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int  n = s.length();
        int sign = 1;
        int x = 0;

        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

       
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-'){
                sign = -1;
            } 
            i++;
        }

        
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            
            if (x > Integer.MAX_VALUE / 10 || 
               (x == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            x = x * 10 + digit;
            i++;
        }

        return x * sign;
    }
}