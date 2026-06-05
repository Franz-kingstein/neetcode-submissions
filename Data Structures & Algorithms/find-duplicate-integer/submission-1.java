class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            int index = Math.abs(nums[i]);
            if(nums[index] < 0) return index;
            nums[index] = -nums[index];
            
        }
        return -1;
        
    }
}
