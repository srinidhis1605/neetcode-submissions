class MinStack {
    Stack<Integer> s;
    Stack<Integer> minst;
    public MinStack() {
        s = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minst.isEmpty() || val<=minst.peek()){minst.push(val);}
        
    }
    
    public void pop() {
        int removed=0;
        if(!s.isEmpty()){
            removed = s.pop();
        }
        if (removed == minst.peek()) {
            minst.pop();
        }
    }
    public int top() {
        int top = s.peek();
        return top;
    }
    public int getMin() {
         return minst.peek();
    }
}
