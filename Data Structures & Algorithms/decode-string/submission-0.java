class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuffer> ch = new Stack<>();
        StringBuffer result = new StringBuffer();
        int k = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) k = k*10+(c-'0');
            else if(c == '['){
               count.push(k);
               ch.push(result);
               result = new StringBuffer();
               k = 0;
            }
            else if(c == ']'){
                StringBuffer d = ch.pop();
                int ck = count.pop();

                while(ck-- > 0){
                    d.append(result);
                }
                result = d;
            }
            else{
                result.append(c);
                        }
        }

        return result.toString();
    }
}