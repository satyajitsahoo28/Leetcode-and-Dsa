class Solution {
    // Direction vectors: up, right, down, left
    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};

    public boolean solve(char[][] board, int r, int c, int idx, String word) {
        // Base case: all characters matched
        if (idx == word.length()) {
            return true;
        }

        // Out of bounds or character mismatch
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != word.charAt(idx)) {
            return false;
        }

        // Temporarily mark this cell as visited
        char temp = board[r][c];
        board[r][c] = '#';

        // Explore all 4 directions
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (solve(board, nr, nc, idx + 1, word)) {
                return true;
            }
        }

        // Backtrack: restore the cell
        board[r][c] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // Try to start DFS from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (solve(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
