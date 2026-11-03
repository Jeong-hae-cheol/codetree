import java.util.Scanner;
public class Main {
    static int n,r,c;
    static int[][] grid;
    static int[] dr = new int[]{-1, 1, 0, 0};
    static int[] dc = new int[]{0, 0, -1, 1};

    public static boolean inRange(int r, int c) {
        return r > 0 && r <= n && c > 0 && c <= n;
    }

    public static void solve() {
        int maxNum = grid[r][c];

        System.out.print(maxNum + " ");

        while(true) {
            int num = 0;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(inRange(nr, nc)) {
                    num = grid[nr][nc];
                    if(num > maxNum) {                        
                        System.out.print(num + " ");
                        r = nr;
                        c = nc;
                        break;
                    }
                }
            }

            if(num > maxNum) {
                maxNum = num;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        grid = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        solve();
    }    
}