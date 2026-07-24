class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        if(nums.length == 0  || (nums.length == 1 && nums[0] != target)) return result;
        List<Integer> temp = new ArrayList<>();
        helper(temp,nums,0, target);
        return result;
    }
    void helper(List<Integer> temp,int[] nums,int index, int target){
        if(temp.stream().mapToInt(Integer::intValue).sum() == target) result.add(new ArrayList<>(temp));
        else if(temp.stream().mapToInt(Integer::intValue).sum() > target) return;
        for(int i = index; i < nums.length;i++){
            temp.add(nums[i]);
            helper(temp,nums,i,target);
            temp.remove(temp.size()-1);
        }
    }
}
