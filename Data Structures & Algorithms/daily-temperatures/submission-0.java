class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[] = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < temperatures.length;i++){
            if(s.isEmpty()) s.push(i);
            else if(temperatures[i] < temperatures[s.peek()]) s.push(i);
            else{
                while((!s.isEmpty()) && (temperatures[s.peek()] < temperatures[i])){
                    int b = s.pop();
                    System.out.println(b);
                    result[b] = i-b;
                }
                s.push(i);
            }
        }
        return result;
    }
}
