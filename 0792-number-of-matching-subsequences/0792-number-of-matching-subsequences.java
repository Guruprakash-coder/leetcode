class Solution {
    private boolean isSubsequence(String t, String s) {
        int n1 = t.length();
        int n2 = s.length();

        int i=0, j=0;
        while (i<n1 && j<n2) {
            if (t.charAt(i) == s.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j==n2;
    }

    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }


        for (String word : map.keySet()) {
            result += (isSubsequence(s, word)) ? map.get(word) : 0;
        }
        return result;
    }
}