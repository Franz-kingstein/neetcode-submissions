class Solution {
    List<List<Integer>> result = new ArrayList<>();

    void helper(List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
             result.add(new ArrayList<>(temp));
             return;
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        helper(new ArrayList<>(),nums);
        return result;
        
    }
}
