class MyStack {
Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    public void push(int x) {
        q.offer(x);
        int n=q.size()-1;
        while(n>0){
        int temp=q.poll();
        q.offer(temp);
        n--;
        }
    }
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
    return q.isEmpty();
    }
}

