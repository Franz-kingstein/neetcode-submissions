class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < s.length();i++){
           char c = s.charAt(i);
           //System.out.println(c);
           if(c == '{' || c == '[' || c == '('){
            st.push(c);
            System.out.println(st.peek());
           }
           else if (!st.isEmpty()){
            if(c == '}'){
                if(st.peek() == '{') st.pop();
                else return false;
            }
            if(c == ']'){
                if(st.peek() == '[') st.pop();
                else return false;
            }
            if(c == ')'){
                if(st.peek() == '(') st.pop();
                else return false;
            }
            //System.out.println("pop");
           }
           else return false;
        }
        if(st.isEmpty()) return true;
        return false;
        
    }
}
