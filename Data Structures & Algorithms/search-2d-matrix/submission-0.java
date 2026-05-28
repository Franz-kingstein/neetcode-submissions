class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rlow = 0;
        int rhigh = matrix.length-1;
        while(rlow <= rhigh){
            int clow = 0;
            int chigh = matrix[0].length-1;
            int mid = rlow + (rhigh-rlow)/2;
            while(clow <= chigh){
                int cmid = clow + (chigh-clow)/2;
                if(matrix[mid][cmid] == target) return true;
                else if (matrix[mid][cmid]  < target) clow = cmid +1;
                else if (matrix[mid][cmid]  > target) chigh = cmid  - 1;
            }
            if(target > matrix[mid][matrix[0].length-1]) rlow = mid +1;
            else rhigh = mid -1; 
        }
        return false;
    }
}
