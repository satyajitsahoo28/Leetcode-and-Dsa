class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        
    }
    
    public void push(int x) {
        if(!q1.isEmpty()){
            q1.add(x);
        }
        else{
            q2.add(x);
        }
        
    }
    
    public int pop() {
        int val=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                val=q1.poll();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(val);
            }
        }
        else{
            while(!q2.isEmpty()){
                val=q2.poll();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(val);
            }
        }
        return val;
        
    }
    
    public int top() {
        int val=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                val=q1.poll();
                q2.add(val);
            }
        }
        else{
            while(!q2.isEmpty()){
                val=q2.poll();
                q1.add(val);
            }
        }

        return val;
        
    }
    
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */