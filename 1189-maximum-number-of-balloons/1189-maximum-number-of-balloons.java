class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[5];
        for(char ch:text.toCharArray()){
            switch (ch) {
                case 'b':
                freq[0]++;
                break;
                case 'a':
                freq[1]++;
                break;
                case 'l':
                freq[2]++;
                break;
                case 'o':
                freq[3]++;
                break;
                case 'n':
                freq[4]++;
                break;
                 
            }

        }
        
        return Math.min(
                Math.min(freq[0], freq[1]),
                Math.min(
                    Math.min(freq[2] / 2, freq[3] / 2),
                    freq[4]
                )
        );
    }
}