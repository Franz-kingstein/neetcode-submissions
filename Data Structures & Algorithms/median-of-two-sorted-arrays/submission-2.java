class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int low = 0;
        int high = nums1.length;
        int total_left = (nums1.length + nums2.length + 1)/2;
        while(low <= high){
            int cutA = (low + high)/2;
            int cutB = total_left -cutA;
            int A_left = (cutA > 0) ? nums1[cutA-1]: Integer.MIN_VALUE;
            int A_right = (cutA < nums1.length) ? nums1[cutA]:Integer.MAX_VALUE;
            int B_left = (cutB > 0) ? nums2[cutB-1]:Integer.MIN_VALUE;
            int B_right = (cutB < nums2.length) ? nums2[cutB]: Integer.MAX_VALUE;
            if(A_left <= B_right && A_right >= B_left){
                if((nums1.length+nums2.length)%2 != 0) return (double) Math.max(A_left,B_left);
                else return (Math.max(A_left,B_left)+Math.min(A_right,B_right))/2.0;
            }
            else if(A_left > B_right){
                high = cutA-1;
            }
            else{
                low = cutA +1;
            }
        }
            return 0.0;

        
    }
}
