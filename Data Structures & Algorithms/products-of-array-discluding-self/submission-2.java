class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int safe = 1;
        boolean t = true;
        int count = 0;
        int[] result = new int[nums.length];
        for(int num:nums){
            if(num==0){
               product *= num;
               count++;

            }
            else{
            product *= num;
            safe *= num;
            t = false;
            }
        }
        for(int i=0;i<result.length;i++){
            if(nums[i] == 0 && count > 1){
                result[i] = 0;
            }
            else if(nums[i] == 0){
                result[i] = safe;
            }
            else{
                result[i] = product/nums[i];

            }       
        }
        if(t){
            return nums;
        }
        return result;
        
    }
}  
