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
    public static int MAX_N = 100;
    public static int n, k, m, ans;
    public static int[][] grid = new int[MAX_N + 1][MAX_N + 1];
    public static int[][] startPoints = new int[MAX_N * MAX_N][2];
    public static int[] dr = new int[] {-1, 1, 0, 0};
    public static int[] dc = new int[] {0, 0, -1, 1};

    public static boolean inRange(int r, int c) {
        return r > 0 && r <= n && c > 0 && c <= n;
    }

    public static void cleanStone(int cnt, int start) {
        if (cnt == m) {
            int sum = bfs();
            ans = Math.max(sum, ans);
            return;
        }

        for (int i = start; i <= n * n; i++) {
            int r = i / n + 1;
            int c = i % n + 1;

            if (grid[r][c] == 1) {
                grid[r][c] = 0;
                cleanStone(cnt + 1, i);
                grid[r][c] = 1;
            }
        }
    }

    public static int bfs() {
        int cnt = 0;
        boolean[][] visited = new boolean[n + 1][n + 1];
        for (int l = 0; l < k; l++) {
            Queue<Pair> q = new ArrayDeque<>();
            q.offer(new Pair(startPoints[l][0], startPoints[l][1]));
            while (!q.isEmpty()) {
                Pair p = q.poll();
                int cr = p.r;
                int cc = p.c;

                for (int i = 0; i < 4; i++) {
                    int nr = cr + dr[i];
                    int nc = cc + dc[i];

                    if (inRange(nr, nc) && !visited[nr][nc] && grid[nr][nc] == 0) {
                        visited[nr][nc] = true;
                        cnt++;
                        q.offer(new Pair(nr, nc));
                    }
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < k; i++) {
            startPoints[i][0] = sc.nextInt();
            startPoints[i][1] = sc.nextInt();
        }
        // Please write your code here.
        cleanStone(0, 1);

        System.out.print(ans);
    }
}
