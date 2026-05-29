
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int carFleet = position.length;
        TreeMap<Integer,Double> tm = new TreeMap<>();
        for(int i = 0; i < position.length;i++){
            tm.put(position[i],(double)(target-position[i])/speed[i]);
        }
        Stack<Double> s = new Stack<>();
        for(Integer positions : tm.descendingKeySet()){
            if(s.isEmpty()) s.push(tm.get(positions));
            else{
                if(s.peek() >= tm.get(positions)) carFleet--;
                else s.push(tm.get(positions));
            }
        }
        return carFleet;
    }
}
