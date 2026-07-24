class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void helper(List<Integer> temp,int k,int n, int index){
        if(temp.size() == k){ result.add(new ArrayList<>(temp));
        return;
        }
        for(int i = index; i <= n;i++){
            temp.add(i);
            helper(temp,k,n,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        helper(temp,k,n,1);
        return result;
    }
}