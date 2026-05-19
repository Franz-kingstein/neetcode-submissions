class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev2 = 0;
        int prev1 = 0;
        for(int i = 0; i < cost.length;i++){
            int current = cost[i] + Math.min(prev2,prev1);
            prev2 = prev1;
            prev1 = current;
        }
        return Math.min(prev1,prev2);
    
    }
}
