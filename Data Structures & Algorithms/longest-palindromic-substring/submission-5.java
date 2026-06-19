class Solution {
    boolean pali(String s){
        for(int i = 0; i < s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int result = 0;
        String res = s.substring(0,1) ;
        HashMap<Character,List<Integer>> hm = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                List<Integer> a = hm.get(s.charAt(i));
                for(int num : a){
                    if(pali(s.substring(num, i+1)) && result < i-num+1) {
                        result = i-num+1;
                        res = s.substring(num, i+1);
                        }
                }
                a.add(i);
                hm.put(s.charAt(i),a);
            }
            else{
                List<Integer> a = new ArrayList<>();
                a.add(i);
                hm.put(s.charAt(i),a);
            }
            
        }
        return res;
    }
}
