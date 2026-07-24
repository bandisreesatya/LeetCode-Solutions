class MyStack {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int ele=0;
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        ele= q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return ele;
    }
    
    public int top() {
        int ele=0;
        while(q1.size()!=0){
            ele=q1.remove();
            q2.add(ele);
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return ele;
    }
    
    public boolean empty() {
        return q1.isEmpty();
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