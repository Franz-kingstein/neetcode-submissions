class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> space = new ArrayDeque<>();
        for(int i : asteroids){
            if(space.isEmpty()) space.offerLast(i);
            else if( (i < 0 && space.peekLast() > 0)){
                while(!space.isEmpty() && i < 0 && space.peekLast() > 0 && Math.abs(space.peekLast()) <  Math.abs(i)) space.pollLast();
                if(space.isEmpty() || space.peekLast()/Math.abs(space.peekLast()) == i/Math.abs(i) ) space.addLast(i);
                else if(space.peekLast() + i == 0) space.pollLast();
                //else if(space.peek() == i) space.offerLast(i);
            }
            else space.offerLast(i);
        }
        int[] a = new int[space.size()];
        int index = 0;
        while(!space.isEmpty()){
            a[index++] = space.pollFirst(); 
        }
        return a;

        
    }
}