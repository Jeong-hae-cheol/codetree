import java.util.Scanner;
public class Main {
    static int n, m, t;
    static int[][] grid, marbles;
    static int[] dr = new int[]{-1, 1, 0 ,0};
    static int[] dc = new int[]{0, 0, -1, 1};

    static boolean inRange(int r, int c) {
        return r > 0 && r <= n && c > 0 && c <= n;
    }
    static void check() {
        for(int i = 0; i < m; i++) {
            int r = marbles[i][0];
            int c = marbles[i][1];

            if(r == 0 && c == 0) 
                continue;

            for(int j = 0; j < m; j++) {
                if(i == j) 
                    continue;

                if(r == marbles[j][0] && c == marbles[j][1]) {
                    marbles[i][0] = 0;
                    marbles[i][1] = 0;
                    marbles[j][0] = 0;
                    marbles[j][1] = 0;
                }
            }
        }
    }

    static void solve() {
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < m; j++) {
                int r = marbles[j][0];
                int c = marbles[j][1];

                if(r == 0 && c == 0)
                    continue;

                int num = 0;

                for(int k = 0; k < 4; k++) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];

                    if(inRange(nr, nc)) {
                        if(num < grid[nr][nc]) {
                            num = grid[nr][nc];
                            marbles[j][0] = nr;
                            marbles[j][1] = nc;
                        }
                    }                
                }
            }
            check();
        }        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();
        grid = new int[n+1][n+1];        
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                grid[i][j] = sc.nextInt();
        marbles = new int[m][2];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt();
            marbles[i][1] = sc.nextInt();
        }
        // Please write your code here.
        solve();
        
        int ans = m;        

        for (int i = 0; i < m; i++) {
            int r = marbles[i][0];
            int c = marbles[i][1];

            if(r == 0 && c == 0) {
                ans--;
            }                    
        }

        System.out.print(ans);
    }
}