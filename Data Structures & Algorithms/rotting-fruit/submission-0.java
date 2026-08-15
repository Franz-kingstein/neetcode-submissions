class Solution {
    public int orangesRotting(int[][] grid) {
        Deque<int[]> q = new ArrayDeque<>();
        int fresh = 0;
        int count = 0;
        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0 ; j < grid[0].length;j++){
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2) q.offer(new int[]{i,j});
            }
        }
        if(fresh == 0) return 0;
        if(q.isEmpty()) return -1;
        while(!q.isEmpty()){
            int size = q.size();
            count++;
            for(int i = 0 ; i < size; i++)
            {
                int[] arr = q.poll();
            if(arr[0]-1 >=0 && grid[arr[0]-1][arr[1]] == 1){
                fresh--;
                grid[arr[0]-1][arr[1]] =2 ;
                q.offer(new int[]{arr[0]-1,arr[1]});
            }
            if(arr[0]+1 <grid.length && grid[arr[0]+1][arr[1]] == 1){
                fresh--;
                grid[arr[0]+1][arr[1]] =2 ;
                q.offer(new int[]{arr[0]+1,arr[1]});
            }
            if(arr[1]-1 >=0 && grid[arr[0]][arr[1]-1] == 1){
                fresh--;
                grid[arr[0]][arr[1]-1] =2 ;
                q.offer(new int[]{arr[0],arr[1]-1});
            }
            if(arr[1]+1 <grid[0].length && grid[arr[0]][arr[1]+1] == 1){
                fresh--;
                grid[arr[0]][arr[1]+1] =2 ;
                q.offer(new int[]{arr[0],arr[1]+1});
            }
            if(fresh <= 0) return count;
            }
        }
        return fresh<=0?count:-1;
    }
}