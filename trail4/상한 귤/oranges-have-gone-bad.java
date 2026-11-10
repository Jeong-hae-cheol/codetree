import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Pair {
    int r, c, t;

    Pair(int r, int c, int t) {
        this.r = r;
        this.c = c;
        this.t = t;
    }
}

public class Main {
    public static int MAX_N = 100;
    public static int MAX_K = MAX_N * MAX_N;
    public static int n, k;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[] dr = new int[] {-1, 1, 0, 0};
    public static int[] dc = new int[] {0, 0, -1, 1};
    public static boolean[][] visited = new boolean[MAX_N][MAX_N];
    public static int[][] ansGrid = new int[MAX_N][MAX_N];

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }

    public static boolean isCan(int r, int c) {
        return inRange(r, c) && !visited[r][c] && grid[r][c] != 0;
    }

    public static void init() {
        for (int i = 0; i < MAX_N; i++)
            for (int j = 0; j < MAX_N; j++) {
                visited[i][j] = false;
                if (grid[i][j] == 0) {
                    ansGrid[i][j] = -1;
                } else {
                    ansGrid[i][j] = -2;
                }
            }
    }

    public static void bfs() {
        Queue<Pair> q = new ArrayDeque<>();

        init();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = true;
                    ansGrid[i][j] = 0;
                }
            }
        }

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int cr = p.r;
            int cc = p.c;
            int ct = p.t;

            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                int nt = ct + 1;
                if (isCan(nr, nc)) {
                    q.offer(new Pair(nr, nc, nt));
                    visited[nr][nc] = true;
                    ansGrid[nr][nc] = nt;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        // Please write your code here.
        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ansGrid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
