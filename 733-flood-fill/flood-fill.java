class Solution {
    void dfs(int[][] image,boolean[][] vis,int sr,int sc,int sourceCol,int color){
        int n=image.length;
        int m=image[0].length;
        vis[sr][sc]=true;
        image[sr][sc]=color;
        for(int delRow=-1;delRow<=1;delRow++){
            for(int delCol=-1;delCol<=1;delCol++){
                if(Math.abs(delCol)+Math.abs(delRow)!=1){
                    continue;
                }
                int nrow=sr+delRow;
                int ncol=sc+delCol;
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                && !vis[nrow][ncol] && image[nrow][ncol]==sourceCol){
                    dfs(image,vis,nrow,ncol,sourceCol,color);
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        boolean[][] vis=new boolean[n][m];
        int sourceCol=image[sr][sc];
        if(!vis[sr][sc]&& image[sr][sc]==sourceCol){
            dfs(image,vis,sr,sc,sourceCol,color);
        }
      
        return image;
    }
}