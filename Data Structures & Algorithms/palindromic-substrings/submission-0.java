class Solution {
    public boolean ispali(String s){
        StringBuilder sa = new StringBuilder(s);
        return s.equals(sa.reverse().toString());
    }
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i; j<s.length();j++){
                if(ispali(s.substring(i,j+1))){
                    count++;
                }
            }
        }
        return count;
    }
}
