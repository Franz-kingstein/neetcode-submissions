class Solution {
    public int maxProduct(int[] nums) {
        int result = Arrays.stream(nums).max().getAsInt();
        int min = 1;
        int max = 1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]==0){
                min = 1;
                max = 1;
            }
            int temp = Math.min(nums[i],Math.min(nums[i]*max,nums[i]*min));
            max = Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min = temp;
            result = Math.max(result,max);
        }
        return result;
        
    }
}
