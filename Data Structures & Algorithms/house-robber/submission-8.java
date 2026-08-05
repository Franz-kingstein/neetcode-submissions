class Solution {
    public int rob(int[] nums) {
        int ans = 0;
        int n = nums.length;

        int dp[] = new int[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            int prev2 = (i == 1) ? 0 : dp[i-2];
            dp[i] = Math.max(dp[i-1], prev2 + nums[i]);
        }

        return dp[n-1];
    }
}
