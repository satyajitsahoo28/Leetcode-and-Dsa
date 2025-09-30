class Solution {
    int dr[]={-1,0,1,0};
    int dc[]={0,1,0,-1};
    public boolean solve(char[][] board,String word,boolean[][] vis,int r,int c,int idx){
        if(idx==word.length()){
            return true;
        }

        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || vis[r][c] || board[r][c] != word.charAt(idx)) {
            return false;
        }

        vis[r][c]=true;
        
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(solve(board,word,vis,nr,nc,idx+1)){
                return true;
            }
        }
        vis[r][c]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,word,vis,i,j,0)){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}