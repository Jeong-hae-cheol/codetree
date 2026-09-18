import java.util.Scanner;
public class Main {
    static int[][] board;
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        board = new int[n][m];
        int dir = 0;
        // RDLU
        int[] dr = new int[] {0, 1, 0, -1};
        int[] dc = new int[] {1, 0, -1, 0};
        int nowR = 0;
        int nowC = 0;

        for (int i = 1; i <= n * m; i++) {
            board[nowR][nowC] = i;
            
            int r = nowR + dr[dir];
            int c = nowC + dc[dir];

            if (!inRange(r, c) || board[r][c] != 0) {
                dir = (dir + 1) % 4;
            }

            nowR =  nowR + dr[dir];
            nowC =  nowC + dc[dir];

            // for (int a = 0; a < n; a++) {
            //     for (int b = 0; b < m; b++) {
            //         System.out.print(board[a][b] + " ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

    static boolean inRange(int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= m) {
            return false;
        }
        return true;
    }
}
