import java.util.Scanner;
public class Main {
    static int n, m, ans;
    static int[][] grid;
    static int[] dr = new int[] {-1, 1, 0, 0};
    static int[] dc = new int[] {0, 0, -1, 1};
    static boolean[][] visited = new boolean[101][101];

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < m;
    }
    public static void DFS(int r, int c) {
        if (ans == 1) {
            return;
        }

        if (r == n - 1 && c == m - 1) {
            ans = 1;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (inRange(nr, nc) && !visited[nr][nc] && grid[nr][nc] == 1) {
                visited[nr][nc] = true;
                DFS(nr, nc);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        DFS(0, 0);

        System.out.print(ans);
    }
}
