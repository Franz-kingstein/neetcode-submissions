class Solution {
    public String simplifyPath(String path) {
        String[] splitted = path.split("/");
        System.out.println(Arrays.toString(splitted));
        Deque<String> stack = new ArrayDeque<>();
        for(String i : splitted){
            if(i.equals("..")) {if(!stack.isEmpty()) stack.pollLast();}
            else if( i.equals(".") || i.isEmpty()) continue;
            else stack.offerLast(i);
        }
        if(stack.isEmpty()) return "/";
        StringBuffer sc = new StringBuffer();
        while(!stack.isEmpty()){
            sc.append("/");
            sc.append(stack.pollFirst());

        }
        return sc.toString();
    }
}