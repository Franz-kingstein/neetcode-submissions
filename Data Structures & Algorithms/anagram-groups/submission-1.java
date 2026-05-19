class Solution {
    public boolean isanagram(String a,String b){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            if(!hm1.containsKey(a.charAt(i))){
                hm1.put(a.charAt(i),1);
            }
            else{
                hm1.put(a.charAt(i),(hm1.get(a.charAt(i))+1));
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(!hm2.containsKey(b.charAt(i))){
                hm2.put(b.charAt(i),1);
            }
            else{
                hm2.put(b.charAt(i),(hm2.get(b.charAt(i))+1));
            }
        }
        return hm1.equals(hm2);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> LM = new ArrayList<>();
        for(int i = 0 ; i < strs.length; i++){
            if(strs[i].equals("*")){
                continue;
            }
            else{
                List<String> L= new ArrayList<>();
                L.add(strs[i]);
                for(int j = i+1; j<strs.length;j++){
                    if(isanagram(strs[i],strs[j])){
                        L.add(strs[j]);
                        strs[j] = "*";
                    }
                }
                LM.add(L);
            }
            
        }
        return LM;
        
    }
}
