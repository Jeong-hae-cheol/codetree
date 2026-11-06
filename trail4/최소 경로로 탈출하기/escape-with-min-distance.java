import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Pair {
    int r, c, d;

    Pair(int r, int c, int d) {
        this.r = r;
        this.c = c;
        this.d = d;
    }
}

public class Main {
    public static int MAX_N = 101;
    public static int n, m, ans;
    public static int[][] a;
    public static boolean[][] visited = new boolean[MAX_N][MAX_N];
    public static int[] dr = new int[] {-1, 1, 0, 0};
    public static int[] dc = new int[] {0, 0, -1, 1};

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < m;
    }

    public static void BFS(int r, int c) {
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(r, c, 0));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Pair cp = q.poll();
            int cr = cp.r;
            int cc = cp.c;
            int cd = cp.d;
            
            if (cr == n - 1 && cc == m - 1) {    
                if(ans == -1) {
                    ans = cd;
                } else {
                    ans = Math.min(ans, cd);
                }                
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];

                if (inRange(nr, nc) && !visited[nr][nc] && a[nr][nc] == 1) {
                    q.offer(new Pair(nr, nc, cd + 1));
                    visited[nr][nc] = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        ans = -1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        // Please write your code here.
        BFS(0, 0);

        System.out.print(ans);
    }
}
