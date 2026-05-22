class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int boxide = (i/3)*3+(j/3);
                char s = board[i][j];
                String rowid ="r" +  s + i;
                String colid = "c" + s + j;
                String boxid = "b" + s + boxide;
                if(hs.contains(rowid) || hs.contains(colid) || hs.contains(boxid)) return false;
                hs.add(rowid);
                hs.add(colid);
                hs.add(boxid);  
                }
            }
        }
        return true;
        
    }
}
