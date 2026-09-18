import java.util.Scanner;
public class Main {

    static int[][] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int ans = solve();

        System.out.print(ans);
    }

    static int solve() {
        int ans = 0;
        // 상하좌우
        int[] dr = new int[] {-1, 1, 0, 0};
        int[] dc = new int[] {0, 0, -1, 1};

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int cnt = 0;
                for (int i = 0; i < 4; i++) {
                    if (inRange(r + dr[i], c + dc[i]) && arr[r + dr[i]][c + dc[i]] == 1) {
                        cnt++;
                    }
                }
                if (cnt >= 3) {
                    ans++;
                }
            }
        }

        return ans;
    }

    static boolean inRange(int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= n) {
            return false;
        }

        return true;
    }
}
