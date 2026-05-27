class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayList<Integer> a = new ArrayList<>();
        int count = 0;
        int maxCount = 1;
        int max = 0;
        int maxArea = 0;
        for(int h : heights){
            if(!a.contains(h)){
                for(int ab : heights){
                    if(ab >= h){
                        count = count + 1;
                        continue;
                        //System.out.println(ab + " " + count);
                    }
                    else{
                        //System.out.println(count);
                        if(maxCount < count){
                            maxCount = count;
                            
                        }
                            count = 0;
                    }
                }
                if(count > maxCount) maxCount = count;
                if (maxArea < h*maxCount) maxArea = h*maxCount;
                maxCount = 1;
                count = 0;
                a.add(h);
            }
        }
        return maxArea;
        
    }
}
