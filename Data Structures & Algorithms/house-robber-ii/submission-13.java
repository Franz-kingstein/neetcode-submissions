class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length;
        return Math.max(helper(nums, 0, n-2), helper(nums, 1, n-1));
    }

    public int helper(int nums[], int start, int end) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {
            int temp = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = temp;
        }

        return Math.max(prev2, prev1);
    }
}
