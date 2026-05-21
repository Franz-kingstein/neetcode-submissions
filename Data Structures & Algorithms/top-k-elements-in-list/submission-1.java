class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
       // ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            hm.put(nums[i],(hm.getOrDefault(nums[i],0)+1));
           // if(hm.get(nums[i]) >= k && !a.contains(nums[i])) a.add(nums[i]);
        }
        int[] arr = new int[k];
        for(int i = 0; i < k;i++) {
            Map.Entry<Integer, Integer> maxEntry = Collections.max(hm.entrySet(), 
    Map.Entry.comparingByValue()
);



            arr[i] = maxEntry.getKey();
            hm.remove(maxEntry.getKey());
        }
        return arr; 

        
    }
}
