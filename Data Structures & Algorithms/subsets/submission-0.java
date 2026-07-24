class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    void helper(List<Integer> temp, int[] nums,int index){
        //if(index == nums.length) return;
        result.add(new ArrayList<>(temp));
        for(int i = index ; i < nums.length; i++){
            temp.add(nums[i]);
            helper(temp,nums,i+1);
            temp.remove(temp.size() -1);
        }
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
       // result.add(temp);
        if(nums.length == 0) return result;
        helper(temp,nums,0);
        return result;
    }
}
