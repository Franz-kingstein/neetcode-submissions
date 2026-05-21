class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        if (strs.isEmpty())  return null;            
        for(String str:strs){
            if(str.equals("")) {
                String ab = "\"\"";
                s.append(ab);
            }else{
            s.append(str);
            }
           // System.out.println(str);
            s.append("`");
        }
        
        //System.out.println(s);
        return s.toString();

    }
    

    public List<String> decode(String str) {
        if (str == null){
            return new ArrayList<>();
        }
        List<String> s = new ArrayList<>(Arrays.asList(str.split("`")));
        String ab = "";
       // s.replaceAll(element -> element.equals("") ? ab : element);        
        s.replaceAll(element -> element.equals("\"\"") ? "" : element);        
        return s;

    }
}
