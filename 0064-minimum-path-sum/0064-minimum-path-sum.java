class Solution {

    public int path(int i, int j, int[][] grid) {
        
        if (i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return (int) 1e9;

        int up = grid[i][j] + path(i - 1, j, grid);
        int left = grid[i][j] + path(i, j - 1, grid);

        return Math.min(up, left);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        return path(m - 1, n - 1, grid);
    }
}
