import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.

        int[][] board = new int[200][200];
        int offset = 100;

        for (int i = 0; i < n; i++) {
            for (int r = y[i]+100; r < y[i]+108; r++) {
                for (int c = x[i]+100; c < x[i]+108; c++) {
                    board[r][c] = 1;
                }
            }
        }

        int cnt = 0;

        for (int r = 0; r < 200; r++) {
            for (int c = 0; c < 200; c++) {
                if(board[r][c] == 1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}