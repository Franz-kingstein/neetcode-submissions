class Solution {
    public int missingNumber(int[] nums) {
        int a = 0;
        for(int i : nums) a ^= i;
        int b = 0;
        for(int i = 0; i <=nums.length;i++) b^=i;
        return b^a;
        
    }
}