import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        // Please write your code here.
        int[][] board = new int[2000][2000];
        int offset = 1000;

        for (int r = ay1; r < ay2; r++) {
            for (int c = ax1; c < ax2; c++) {
                board[r+offset][c+offset] = 1;
            }
        }

        for (int r = by1; r < by2; r++) {
            for (int c = bx1; c < bx2; c++) {
                board[r+offset][c+offset] = 1;
            }
        }

        for (int r = my1; r < my2; r++) {
            for (int c = mx1; c < mx2; c++) {
                board[r+offset][c+offset] = 0;
            }
        }

        int cnt = 0;

        for (int r = 0; r < 2000; r++) {
            for (int c = 0; c < 2000; c++) {
                if(board[r][c] == 1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}