class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr1[] = new int[128];
        int arr2[] = new int[128];
        int left = 0;
        for(int i = 0; i < s1.length();i++){
            arr1[s1.charAt(i)]++;
        }
        for(int i = 0; i < s2.length();i++){
            arr2[s2.charAt(i)]++;
            if(i-left + 1 == s1.length()){
                if (Arrays.equals(arr1,arr2)) return true;
                else {
                    arr2[s2.charAt(left)]--;
                    left++;
                }
            }
        }
        return false;

    }
}
