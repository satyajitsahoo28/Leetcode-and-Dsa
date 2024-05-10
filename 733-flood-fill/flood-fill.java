class Solution {
    void dfs(int[][] image,int sr,int sc,int sourceCol,int color){
        int n=image.length;
        int m=image[0].length;
        image[sr][sc]=color;
        for(int delRow=-1;delRow<=1;delRow++){
            for(int delCol=-1;delCol<=1;delCol++){
                if(Math.abs(delCol)+Math.abs(delRow)!=1){
                    continue;
                }
                int nrow=sr+delRow;
                int ncol=sc+delCol;
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                && image[nrow][ncol]==sourceCol){
                    dfs(image,nrow,ncol,sourceCol,color);
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        boolean[][] vis=new boolean[n][m];
        int sourceCol=image[sr][sc];
        if(sourceCol==color){
            return image;
        }
        dfs(image,sr,sc,sourceCol,color); 
        return image;
    }
}