class Solution {
    public boolean ispali(String s){
        StringBuilder sa = new StringBuilder(s);
        return s.equals(sa.reverse().toString());
    }
    public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    String maxStr = s.substring(0, 1);

    // Outer loop: try every possible starting point
    for (int i = 0; i < s.length(); i++) {
        // Inner loop: try every possible ending point from i to the end
        for (int j = i; j < s.length(); j++) {
            String sub = s.substring(i, j + 1);
            if (sub.length() > maxStr.length() && ispali(sub)) {
                maxStr = sub;
            }
        }
    }
    return maxStr;
}


}
