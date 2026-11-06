import java.util.Scanner;
public class Main {
    public static int n, ans;
    public static int[][] grid;

    public static void solve() {        
        for(int i = 0; i < n-2; i++) {
            for(int j = 0; j < n-2; j++) {
                int cnt = 0;
                for(int r = i; r < i+3; r++) {
                    for(int c = j; c < j+3; c++) {
                        if(grid[r][c] == 1) {
                            cnt++;
                        }
                    }
                }
                ans = Math.max(cnt, ans);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        solve();
        System.out.print(ans);
    }
}