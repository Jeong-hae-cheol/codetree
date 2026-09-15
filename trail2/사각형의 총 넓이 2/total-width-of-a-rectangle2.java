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
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();            
        }
        // Please write your code here.
        
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = y1[i]; j < y2[i]; j++) {
                for (int k = x1[i]; k < x2[i]; k++) {
                    board[j+offset][k+offset] = 1;
                }
            }
        }

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