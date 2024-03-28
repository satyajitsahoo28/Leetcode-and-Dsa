class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                     List<Integer> index=new ArrayList<>();
                     index.add(i);
                     index.add(j);
                     list.add(index);
                }
            }
        }

        for(int i=0;i<list.size();i++){
            int row=list.get(i).get(0);
            int col=list.get(i).get(1);
            int top=row;
            int bottom=row;
            int left=col;
            int right=col;

            //top
            while(top>=0){
                matrix[top--][col]=0;
            }
            //bottom
            while(bottom<matrix.length){
                matrix[bottom++][col]=0;
            }
            //left
            while(left>=0){
                matrix[row][left--]=0;
            }
            //right
            while(right<matrix[0].length){
                matrix[row][right++]=0;
            }
        }
        
    }
}