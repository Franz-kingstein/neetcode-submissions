class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,temp,0);
        return result;
    }
    void helper(int[] candidate, int target,List<Integer> temp, int index){
        if(target == 0) result.add(new ArrayList<>(temp));
        //else if(target < 0) return;
        for(int i = index; i < candidate.length;i++){
            if(candidate[i] > target) break;
            if(i > index && candidate[i] == candidate[i-1]) continue;
            
            temp.add(candidate[i]);
            helper(candidate,target - candidate[i],temp,i+1);
            temp.remove(temp.size() -1);
        }
    }
}
