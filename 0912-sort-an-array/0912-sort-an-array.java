class Solution {
    public int[] sortArray(int[] nums) {
    int min = nums[0];
    int max = nums[0];

    for(int num : nums) {
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

    int[] freq = new int[max - min + 1];

    for(int num : nums) {
        freq[num - min]++;
    }

    int idx = 0;
    for(int i = 0; i < freq.length; i++) {
        while(freq[i]-- > 0) {
            nums[idx++] = i + min;
        }
    }

    return nums;
}
}