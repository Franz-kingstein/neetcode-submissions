class MinStack {
    Stack<Integer> st;
    List<Integer> n;

    public MinStack() {
        st = new Stack<>();
        n = new ArrayList<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        n.add(val);
        Collections.sort(n);
    }
    
    public void pop() {
        int a = st.pop();
        n.remove(Integer.valueOf(a));
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return n.getFirst();
    }
}
