class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        for(int i = 1; i <= prices.length-1;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            else {
                result = Math.max(result,prices[i]-min);
            }
        }
        return result;
        
    }
}
