class Solution {
    public boolean ispalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count = 1;
        HashSet<String> cache = new HashSet<>();
        cache.add(s.charAt(0) + "");
        for (int i = 1; i < s.length(); i++) {
            HashSet<String> nextCache = new HashSet<>();
            for (String a : cache) {
                nextCache.add(a + s.charAt(i));
                if (ispalindrome(a + s.charAt(i)))
                    count++;
            }
            if (!nextCache.contains(s.charAt(i) + "")) {
                nextCache.add(s.charAt(i) + "");
                count++;
            }
            cache = nextCache;
        }
        return count;
    }
}
