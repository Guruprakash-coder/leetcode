class Solution {
    public int halveArray(int[] nums) {
    long sum = 0;
    PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

    for (int num : nums) {
        sum += num;
        pq.offer((double) num);
    }

    double target = sum / 2.0;
    double reduced = 0;
    int operations = 0;

    while (reduced < target) {
        double largest = pq.poll();
        largest /= 2.0;
        reduced += largest;
        pq.offer(largest);
        operations++;
    }

    return operations;

    }
}