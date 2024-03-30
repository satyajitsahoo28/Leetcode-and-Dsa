class Solution {
    public static void reverseRow(int[][] matrix, int row) {
        int n = matrix[0].length; // Assuming all rows have the same length
        int cs = 0;
        int ce = n - 1;

        while (cs <= ce) {
            int temp = matrix[row][cs];
            matrix[row][cs] = matrix[row][ce];
            matrix[row][ce] = temp;
            cs++;
            ce--;
        }
    }
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start from j = i + 1 to avoid swapping diagonal elements twice
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            reverseRow(matrix,i);
        }
        
    }
}