class Solution {
    boolean[][] visited;
    char[][] grid;
    public void dfs(int i, int j){
        visited[i][j] = true;
        this.grid[i][j] = '2';
        if(i-1 >=0 && grid[i-1][j] == '1') dfs(i-1,j);
        if(i+1 < grid.length && grid[i+1][j] == '1') dfs(i+1,j);
        if(j-1 >=0 && grid[i][j-1] == '1') dfs(i,j-1);
        if(j+1 < grid[0].length && grid[i][j+1] == '1') dfs(i,j+1);

    }
    public int numIslands(char[][] grid) {
        this.grid = grid;
        int island = 0;
        visited = new boolean[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    island++;
                    dfs(i,j);
                }
            }
        }
        return island;       
    }
}