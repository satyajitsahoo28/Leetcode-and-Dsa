class Pair {
    int row;
    int col;
    int step;

    public Pair(int row, int col, int step) {
        this.row = row;
        this.col = col;
        this.step = step;
    }
}

class Solution {

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(entrance[0], entrance[1], 0));
        maze[entrance[0]][entrance[1]] = '+';

        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };

        while (!q.isEmpty()) {
            Pair p = q.remove();

            int row = p.row;
            int col = p.col;
            int step = p.step;

            if (exit(row, col, m, n) && (entrance[0] != row || entrance[1]!=col)) {
                return step;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && maze[newRow][newCol] == '.') {
                    q.add(new Pair(newRow, newCol, step + 1));
                    maze[newRow][newCol] = '+';
                }
            }
        }

        return -1;
    }

    public boolean exit(int i, int j, int m, int n) {
        return (i == 0 || i == m - 1 || j == 0 || j == n - 1);
    }
}
