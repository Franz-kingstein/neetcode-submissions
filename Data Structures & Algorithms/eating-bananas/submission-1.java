class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int result = high;
        while(low <= high){
            int hour = 0;
            int k = low + (high-low)/2;
            for(int i : piles){
                hour += i/k;
                if(i%k !=0) hour ++;
            }
            if(hour <= h){
                result = k;
                high = k -1;
            }
            else  low = k + 1;
        }
        return result;
    }
}
