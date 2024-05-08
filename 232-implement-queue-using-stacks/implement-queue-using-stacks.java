class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
        
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            int val=s1.pop();
            s2.push(val);
        }
        s1.push(x);
        while(!s2.isEmpty()){
            int val=s2.pop();
            s1.push(val);
        }
        
    }
    
    public int pop() {
        int top=s1.peek();
        s1.pop();
        return top;
        
    }
    
    public int peek() {
        int val=s1.peek();
        return val;
        
    }
    
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */