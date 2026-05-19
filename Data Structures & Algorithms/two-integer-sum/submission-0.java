class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> A = new ArrayList<>();
        int num[] = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            int pair = target - nums[i];
            
            // This works perfectly because 'A' is an ArrayList of Objects (Integer)
            if(A.contains(pair)){
                num[1] = i;
                
                // Fix: Look backward in 'nums' to find the original index of 'pair'
                for (int j = 0; j < i; j++) {
                    if (nums[j] == pair) {
                        num[0] = j;
                        break;
                    }
                }
                return num;
            }
            else {
                A.add(nums[i]);
            }
        }
        
        int dummy[] = {0, 0};
        return dummy;
    }
}
