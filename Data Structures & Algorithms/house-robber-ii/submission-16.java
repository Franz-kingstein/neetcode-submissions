class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int first = helper(nums,0,nums.length-2);
        int second = helper(nums,1,nums.length-1);
        return Math.max(first,second);
    }
    public int helper(int[] nums, int start, int end){
        int prev1 = 0;
        int prev2 = 0;
        for(int i = start; i <= end;i++){
            int temp = Math.max(prev1,prev2+nums[i]);
            prev2 = prev1;
            prev1 = temp;
        }
        return Math.max(prev1,prev2);
    }
}
