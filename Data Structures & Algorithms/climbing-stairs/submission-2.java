class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n==2) return 2;
        a.add(0,1);
        a.add(1,2);
        for(int i = 2; i <n;i++){
            a.add(i,a.get(i-1)+a.get(i-2));
        }
        return a.get(n-1);
        
    }
}
