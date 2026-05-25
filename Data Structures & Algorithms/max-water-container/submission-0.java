class Solution {
    public int maxArea(int[] heights) {
        int Max = 0;
        int Volume = 0;
        int i = 0;
        int j = heights.length-1;
        while(i<j){
            Volume = (j-i)*Math.min(heights[i],heights[j]);
            if(Max < Volume) Max = Volume;
            if(heights[i]<heights[j]) i++;
            else j--;
        } 
        return Max;       
    }
}
