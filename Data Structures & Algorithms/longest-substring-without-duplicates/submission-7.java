class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int c[] = new int[128];
        if (s.isEmpty())
            return 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            // 1. While a duplicate of 'current' exists in array 'c'
            while (c[current ] == 1) {
                c[s.charAt(left)] = 0;
                left++;

            }
            c[current]++;
            max = Math.max(max,i-left+1);

            // 2. Now the window is clean! Add 'current' to array 'c'

            // 3. Update your max length using (i - left + 1)
        }
        return max;
    }
}
