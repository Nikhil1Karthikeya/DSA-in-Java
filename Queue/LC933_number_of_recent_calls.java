class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
    q=new LinkedList <>();
    }
    public int ping(int t) {
        q.offer(t);
       int start=t-3000;
while(!q.isEmpty()&&q.peek()<start){
    q.poll();
 
}
return q.size();
    }
}
