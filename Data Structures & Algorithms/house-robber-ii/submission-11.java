class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2 || nums.length == 3) return Arrays.stream(nums).max().getAsInt();

        int[] copy = Arrays.copyOf(nums,nums.length);
        int max = nums[nums.length-1];
        for(int i = nums.length-3; i >0;i--){
            nums[i] = Math.max(max+nums[i],nums[i+1]);
            max = Math.max(max,nums[i+1]);
        }
        int m1= Math.max(nums[1],nums[2]);
        max = copy[copy.length-2];
        for(int i = copy.length-4;i >=0;i--){
            copy[i] = Math.max(max+copy[i],copy[i+1]);
            max = Math.max(max,copy[i+1]);
        }
        int m2 = Math.max(copy[0],copy[1]);

        return Math.max(m1,m2);
        
    }
}
