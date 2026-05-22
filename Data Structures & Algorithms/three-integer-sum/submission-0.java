class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < nums.length -2; i++){
            for(int j = i+1; j < nums.length-1;j++){
                for(int k = j + 1; k < nums.length;k++){
                    if(nums[i] + nums[j]+nums[k] == 0 ){
                        List<Integer> la = new ArrayList<>();
                        la.add(nums[i]);
                        la.add(nums[j]);
                        la.add(nums[k]);
                        Collections.sort(la);
                        if(!l.contains(la)) l.add(la);
                    }
                }
            }
        }
        return l;
    }
}
