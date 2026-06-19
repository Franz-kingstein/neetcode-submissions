class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = nums[nums.length-1];
        for(int i = nums.length-3; i >= 0;i--){
            nums[i] =Math.max(nums[i] + max,nums[i+1]);
            max = Math.max(max,nums[i+1]);
        }
        return Math.max(nums[0],nums[1]);
 
        
    }
}
