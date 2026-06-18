class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length <=2){
            return Arrays.stream(cost)
                        .min()
                        .getAsInt();
        }
        int a = cost[0];
        int b = cost[1];
        int c = 0;
        for(int i = 2; i < cost.length;i++){
            c = cost[i]+Math.min(a,b);
            a = b;
            b = c;
        }
        return Math.min(a,b);
        
    }
}
