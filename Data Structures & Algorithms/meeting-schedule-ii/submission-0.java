/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals,(a,b) -> a.start - b.start);
        ArrayList<ArrayList<Interval>> count = new ArrayList<>();
        for(Interval a : intervals){
            boolean flag = false;
            for(ArrayList<Interval> list : count){
                if(list.get(list.size()-1).end <= a.start){
                    list.add(a);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ArrayList<Interval> n = new ArrayList<>();
                n.add(a);
                count.add(n);
            }
        }
        return count.size();

    }
}
