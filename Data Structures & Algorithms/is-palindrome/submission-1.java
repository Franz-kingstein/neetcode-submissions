class Solution {
    public boolean isPalindrome(String s) {
        String sa = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sab = new StringBuilder(sa);
        String reversed = new StringBuilder(sa).reverse().toString();
        return sa.equals(reversed);
        
    }
}
