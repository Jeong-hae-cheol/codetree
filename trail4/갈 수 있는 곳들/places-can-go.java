import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Pair {
    int r, c;

    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class Main {
    static int n, k, ans;
    static int[][] grid;
    static int[][] starts;
    static boolean[][] totalVisited;
    static int[] dr = new int[] {1, -1, 0, 0};
    static int[] dc = new int[] {0, 0, -1, 1};

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }

    public static void BFS(int r, int c) {
        Queue<Pair> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][n];

        visited[r][c] = true;
        if (!totalVisited[r][c]) {
            ans++;
            totalVisited[r][c] = true;
        } else {
            return;
        }

        q.offer(new Pair(r, c));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int cr = pair.r;
            int cc = pair.c;

            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];

                if (inRange(nr, nc) && grid[nr][nc] != 1 && !visited[nr][nc]) {
                    if (!totalVisited[nr][nc]) {
                        ans++;
                        totalVisited[nr][nc] = true;
                    }
                    visited[nr][nc] = true;
                    q.offer(new Pair(nr, nc));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        starts = new int[k][2];
        for (int i = 0; i < k; i++) {
            starts[i][0] = sc.nextInt();
            starts[i][1] = sc.nextInt();
        }
        // Please write your code here.
        totalVisited = new boolean[n][n];

        for (int i = 0; i < k; i++) {
            BFS(starts[i][0] - 1, starts[i][1] - 1);
        }

        System.out.print(ans);
    }
}
