class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums){
            if(s.contains(num)) return num;
            s.add(num);
        }
        return -1;
        
    }
}
