class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        int arr[] = new int[128];
        int match = 0;
       // int left = 0;
       int minLength = Integer.MAX_VALUE;
        int startIndex = 0;
        //String result = "";
        //StringBuilder sa = new StringBuilder();
        for(int i = 0; i < t.length();i++){
            arr[t.charAt(i)]++;
        }
        int left = 0;
        for(int i = 0; i < s.length();i++){
            char rightChar = s.charAt(i);
            arr[rightChar]--;
            if(arr[rightChar] >= 0) match++;
            while (match == t.length()) {
    // 1. Update minLength and startIndex if current window (i - left + 1) is smaller
    if (i - left + 1 < minLength) {
        minLength = i - left + 1;
        startIndex = left;
    }
    
    // 2. Get the character leaving from the left
    char leftChar = s.charAt(left);
    
    // 3. Put it back in the map
    arr[leftChar]++;
    
    // 4. If we actually needed that character, our match count breaks
    if (arr[leftChar] > 0) {
        match--;
    }
    
    // 5. Move the left pointer forward
    left++;
}
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }
}
