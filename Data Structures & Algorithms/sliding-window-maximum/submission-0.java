class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int left = 0;
        int result[] = new int[nums.length-k+1];
        for(int i = 0; i < nums.length;i++){
            maxHeap.add(nums[i]);
            if(i-left+1 == k){
                result[i-k+1] = maxHeap.peek();
                maxHeap.remove(nums[left]);
                left++;
            }
        }
        return result;
    }
}
