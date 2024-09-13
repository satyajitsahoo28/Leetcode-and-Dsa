class Solution {
    public boolean f(int row, int col, int ind, char[][] board, boolean[][] vis, String word, StringBuilder ans, int[] dr, int[] dc) {
        if (ind == word.length()) {
            if (ans.toString().equals(word)) {
                return true;
            } else {
                return false;
            }
        }

        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                char ch = word.charAt(ind);
                if (ch == board[newRow][newCol] && !vis[newRow][newCol]) {
                    vis[newRow][newCol] = true; // mark as visited
                    ans.append(ch);
                    if (f(newRow, newCol, ind + 1, board, vis, word, ans, dr, dc)) {
                        return true;
                    }
                    ans.deleteCharAt(ans.length() - 1); // backtrack
                    vis[newRow][newCol] = false; // unmark as visited
                }
            }
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    vis[i][j] = true; // mark starting point as visited
                    ans.append(board[i][j]);
                    if (f(i, j, 1, board, vis, word, ans, dr, dc)) {
                        return true;
                    }
                    ans.deleteCharAt(ans.length() - 1); // backtrack
                    vis[i][j] = false; // unmark the starting point
                }
            }
        }
        return false;
    }
}
