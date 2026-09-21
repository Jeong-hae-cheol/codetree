import java.util.Scanner;
public class Main {
    static int n;    
    static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();        
        // Please write your code here.
        board = new int [n][n];
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};
        int dir = 0;
        int r = n/2;
        int c = n/2;

        int dist = 1;
        int cnt = 0;
        int num = 1;

        for (int i = 1; i <= n*n;) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < dist; k++) {
                    board[r][c] = i++;

                    r += dr[dir];
                    c += dc[dir];
                    if(i >= n*n) {
                        break;
                    }                                        
                }
                if(i >= n*n) {
                    break;
                }
                dir = (dir+1)%4;
            }
            dist++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int r, int c) {
        if(r < 0 || r >= n || c < 0 || c >= n) {
            return false;
        }
        return true;
    }
}