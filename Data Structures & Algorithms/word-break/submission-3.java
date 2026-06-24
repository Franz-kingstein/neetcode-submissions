class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length()+1];
        dp[s.length()] = true;

        for(int i = s.length()-1; i >=0;i--){
            for(String st : wordDict){
                if(i + st.length() <= s.length() && st.equals(s.substring(i,i+st.length()))) dp[i] = dp[i+st.length()];
                if(dp[i]) break;
            }
        }
        return dp[0];
    }
}
