class Solution {
    void dfs(int[][] grid,boolean[][] vis,int row,int col){
        vis[row][col]=true;
        int n=grid.length;
        int m=grid[0].length;
        int drow[]={-1,0,+1,0};
        int dcol[]={0,+1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && grid[nrow][ncol]==1){
                dfs(grid,vis,nrow,ncol);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int j=0;j<m;j++){
            if(!vis[0][j] && grid[0][j]==1){
                dfs(grid,vis,0,j);
            }
            if(!vis[n-1][j] && grid[n-1][j]==1){
                dfs(grid,vis,n-1,j);
            }
        }

        for(int i=0;i<n;i++){
            if(!vis[i][0] && grid[i][0]==1){
                dfs(grid,vis,i,0);
            }
            if(!vis[i][m-1] && grid[i][m-1]==1){
                dfs(grid,vis,i,m-1);
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}