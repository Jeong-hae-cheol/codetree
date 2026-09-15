import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int[][] board = new int[200][200];
        int offset = 100;
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + offset;
            y1[i] = sc.nextInt() + offset;
            x2[i] = sc.nextInt() + offset;
            y2[i] = sc.nextInt() + offset;
        }
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            for (int r = y1[i]; r < y2[i]; r++) {
                for (int c = x1[i]; c < x2[i]; c++) {
                    if(i % 2 == 0) {
                        board[r][c] = 1;
                    } else {
                        board[r][c] = 2;
                    }
                }   
            }
        }

        int cnt = 0;
        for (int r = 0; r < 200; r++) {
            for (int c = 0; c < 200; c++) {
                if(board[r][c] == 2) {
                    cnt++;
                }
            }   
        }

        System.out.println(cnt);

    }
}
