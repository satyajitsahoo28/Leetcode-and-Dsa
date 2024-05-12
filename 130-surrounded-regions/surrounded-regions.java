class Solution {
    void dfs(char[][] board,boolean[][] vis,int r,int c){
        int n=board.length;
        int m=board[0].length;
        vis[r][c]=true;
        int[] drow={-1,0,+1,0};
        int[] dcol={0,+1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && board[nrow][ncol]=='O'){
                dfs(board,vis,nrow,ncol);
            }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int j=0;j<m;j++){
            if(!vis[0][j] && board[0][j]=='O'){
                dfs(board,vis,0,j);
            }
            if(!vis[n-1][j] && board[n-1][j]=='O'){
                dfs(board,vis,n-1,j);
            }
        }

        for(int i=0;i<n;i++){
            if(!vis[i][0] && board[i][0]=='O'){
                dfs(board,vis,i,0);
            }
            if(!vis[i][m-1] && board[i][m-1]=='O'){
                dfs(board,vis,i,m-1);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        
    }
}