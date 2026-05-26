class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(String.valueOf(a+b));
            }
            else if(s.equals("-")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push((String.valueOf(b-a)));
            }
            else if(s.equals("*")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(String.valueOf(a*b));
            }
            else if(s.equals("/")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(String.valueOf(b/a));
            }
            else  st.push(s);
        }
        System.out.println(st.peek());
        return Integer.parseInt(st.peek());
        
    }
}
