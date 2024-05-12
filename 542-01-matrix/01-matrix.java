class Pair{
    int row;
    int col;
    int dis;
    Pair(int row,int col,int dis){
        this.row=row;
        this.col=col;
        this.dis=dis;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[n][m];
        boolean[][] vis=new boolean[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    vis[i][j]=true;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=0;
            }
        }

        while(!q.isEmpty()){
            Pair p=q.remove();
            int r=p.row;
            int c=p.col;
            int d=p.dis;

            int drow[]={-1,0,+1,0};
            int dcol[]={0,+1,0,-1};
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && mat[nrow][ncol]==1 && !vis[nrow][ncol]){
                       ans[nrow][ncol]=d+1;
                       vis[nrow][ncol]=true;
                       q.add(new Pair(nrow,ncol,d+1));
                }
            }
           
        }
         return ans;

        
    }
}