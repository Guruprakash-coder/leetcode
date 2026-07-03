class MinStack {
    private PriorityQueue<Integer> pq;
    private Stack<Integer> s;
    public MinStack() {
        pq=new PriorityQueue<>();
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        int x=s.pop();
        pq.remove(x);
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */