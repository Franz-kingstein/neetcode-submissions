class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        int max2 = 0;
        for(int i = 0;i < nums.length-1;i++){
            int temp = Math.max(nums[i]+prev2,prev1);
            prev2 = prev1;
            prev1 = temp;
        }
        max2 = prev1;
        prev1 = 0;
        prev2 = 0;
        for(int i = 1;i < nums.length;i++){
            int temp = Math.max(nums[i]+prev2,prev1);
            prev2 = prev1;
            prev1 = temp;
        }
        return Math.max(prev1,max2);
        
    }
}
