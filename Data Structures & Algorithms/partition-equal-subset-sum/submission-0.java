class Solution {
    public boolean canPartition(int[] nums) {
        HashSet<Integer> cache = new HashSet<>();
        cache.add(0);
        int total = Arrays.stream(nums).sum();
        if(total %2 == 1) return false;
        for(int num : nums){
            HashSet next = new HashSet<>();
            for (int c:cache){
                if(num+c == (total/2)) return true;
                next.add(num+c);
            }
            cache.addAll(next);
        }
        return false;
        
    }
}
