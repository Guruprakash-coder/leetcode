class MinStack {
    private Stack<Integer> min;
    private Stack<Integer> s;
    public MinStack() {
        min=new Stack<>();
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || val <=min.peek()){
            min.push(val);
        }else{
            min.push(min.peek());
        }
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
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