class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target+1];
        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            int total = 0;
            for(int j : nums) {
                if(j <= i) total += dp[i-j];
                }
            dp[i] = total;
        }
        return dp[target];
    }
}