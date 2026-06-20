class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        int max = 0;

        for(int[] match : matches){
            max = Math.max(max, Math.max(match[0], match[1]));
        }

        int[] losses = new int[max + 1];
        boolean[] played = new boolean[max + 1];

        for(int[] match : matches){
            int winner = match[0];
            int loser = match[1];

            played[winner] = true;
            played[loser] = true;

            losses[loser]++;
        }

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();

        for(int i = 1; i <= max; i++){

            if(!played[i]) continue;

            if(losses[i] == 0){
                zero.add(i);
            }
            else if(losses[i] == 1){
                one.add(i);
            }
        }

        return Arrays.asList(zero, one);
    }
}