class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int result = 0;
        int left = 0;
        char ma = ' ';
       // int right = 0;
       int a[] = new int[26];
        for(int i = 0;i< s.length();i++ ){
            a[s.charAt(i)-'A']++;
            max = Math.max(max,a[s.charAt(i)-'A']);
            if(max == a[s.charAt(i)-'A']){
                ma = s.charAt(i);
            }
            if((i-left + 1)- max > k){
                a[s.charAt(left) - 'A']--;
                left++;
                
            }
            result = Math.max(result,i-left+1);
        }
        return result;
        
    }
}
