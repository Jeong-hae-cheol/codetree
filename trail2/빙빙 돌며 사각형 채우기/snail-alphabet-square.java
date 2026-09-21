import java.util.Scanner;
public class Main {
    static int n;
    static int m;
    static char[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        board = new char [n][m];
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        int dir = 0;
        int r = 0;
        int c = 0;

        for (int i = 0; i < n*m; i++) {
            board[r][c] = (char)('A' + (i%('Z' - 'A' + 1)));

            if(!inRange(r+dr[dir],c+dc[dir]) || board[r+dr[dir]][c+dc[dir]] != 0) {
                dir = (dir+1) % 4;
            }

            r = r+dr[dir];
            c = c+dc[dir];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int r, int c) {
        if(r < 0 || r >= n || c < 0 || c >= m) {
            return false;
        }
        return true;
    }
}