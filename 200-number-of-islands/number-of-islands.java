class Solution {
   public static void dfs(char[][] grid, boolean[][] vis, int row, int col) {
    int n = grid.length;
    int m = grid[0].length;

    // Mark current cell as visited
    vis[row][col] = true;

    // Explore unvisited land cell neighbors in all four directions
    for (int delRow = -1; delRow <= 1; delRow++) {
      for (int delCol = -1; delCol <= 1; delCol++) {
        if (Math.abs(delRow) + Math.abs(delCol) != 1) {
            continue;
        }
        int nrow = row + delRow;
        int ncol = col + delCol;

        // Check if neighbor is within grid, unvisited, and a land cell
        if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol] && grid[nrow][ncol] == '1') {
          dfs(grid, vis, nrow, ncol); // Recursive call for exploration
        }
      }
    }
  }

  public static int numIslands(char[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    boolean[][] vis = new boolean[n][m]; // Initialize visited array with False

    int count = 0;
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        if (!vis[row][col] && grid[row][col] == '1') {
          count++; // Found a new island, increment counter
          dfs(grid, vis, row, col); // Explore the connected land area
        }
      }
    }
    return count;
  }
}