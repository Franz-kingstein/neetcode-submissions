class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 1;
        int maxCount = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int num : nums) a.add(num);
        Collections.sort(a);
       // System.out.println(a);
        int acc  = a.get(0);
        System.out.println(acc);
        for(int i = 1; i < a.size();i++){
            if(a.get(i)-acc == 1){ 
                count++;
            }
            else if(a.get(i)-acc == 0);
            else{
                System.out.println("Count " + count);
                if(maxCount < count) maxCount = count; 
                count = 1;
                
            }
            acc = a.get(i);
            System.out.println(acc);

        }
        if(maxCount < count) maxCount = count;
        return maxCount; 
        
    }
}
