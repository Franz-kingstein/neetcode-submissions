class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public void helper(int[] nums, ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                helper(nums,temp);
                temp.remove(temp.size() -1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        helper(nums,new ArrayList<>());
        return result;
        
    }
}
