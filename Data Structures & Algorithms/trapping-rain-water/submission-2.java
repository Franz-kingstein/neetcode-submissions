class Solution {
    public int trap(int[] height) {
        int trap = 0;
        int prefix[] = new int[height.length];
        prefix[0] = height[0];
        int suffix[] = new int[height.length];
        suffix[height.length-1] = height[height.length-1];
        for(int i = 1; i < prefix.length;i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }
        for(int i = suffix.length-2; i >=0;i--){
            suffix[i] = Math.max(suffix[i+1],height[i]);
        }
        for(int i = 0; i < height.length;i++){
            System.out.println(prefix[i] + " " + suffix[i] + "  " + height[i]);
            int temp = Math.min(prefix[i],suffix[i]) - height[i];
            if(temp > 0) trap += temp;
        }
                return trap;
    }
}
