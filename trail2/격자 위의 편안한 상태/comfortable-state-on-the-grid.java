import java.util.Scanner;

public class Main {
    static int n;
    static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] points = new int[m][2];
        
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        // Please write your code here.

        board = new int[n][n];
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        for (int i = 0; i < m; i++) {
            int r = points[i][0] - 1;
            int c = points[i][1] - 1;
            int cnt = 0;

            board[r][c] = 1;

            for (int j = 0; j < 4; j++) {
                if(inRange(r+dr[j], c+dc[j]) && board[r+dr[j]][c+dc[j]] == 1) {
                    cnt++;
                }
            }

            int ans = 0;
            if(cnt == 3) {
                ans = 1;
            }

            System.out.println(ans);
        }
    }

    static boolean inRange(int r, int c) {
        if(r < 0 || r >= n || c < 0 || c >= n) {
            return false;
        }
        return true;
    }
}