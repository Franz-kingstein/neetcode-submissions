class TimeMap {
    private TreeMap<String, TreeMap<Integer,String>> TimeMap;
    public TimeMap() {
        TimeMap = new TreeMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(TimeMap.containsKey(key)){
            TreeMap<Integer,String> tm = TimeMap.get(key);
            tm.put(timestamp,value);
            TimeMap.put(key,tm);
        }
        else{
            TreeMap<Integer,String> tm = new TreeMap<>();
            tm.put(timestamp,value);
            TimeMap.put(key,tm);
        }
        
    }
    
    public String get(String key, int timestamp) {
        if (!TimeMap.containsKey(key)) {
            return "";
        }
        TreeMap<Integer,String> tm = TimeMap.get(key);
        if(tm.containsKey(timestamp)) return tm.get(timestamp);
        Integer a = tm.floorKey(timestamp);
        if(a != null){
            return tm.get(a);
        }
        else{
            return "";
        }
    }
}
