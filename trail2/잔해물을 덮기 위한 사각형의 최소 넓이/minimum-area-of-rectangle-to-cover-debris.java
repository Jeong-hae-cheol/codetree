import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.

        int[][] board = new int[2000][2000];
        int offset = 1000;

        for (int r = rect1_y1; r < rect1_y2; r++) {
            for (int c = rect1_x1; c < rect1_x2; c++) {
                board[r+offset][c+offset] = 1;
            }
        }

        for (int r = rect2_y1; r < rect2_y2; r++) {
            for (int c = rect2_x1; c < rect2_x2; c++) {
                board[r+offset][c+offset] = 0;
            }
        }
        int r_max = 0;
        int r_min = 10000;
        int c_max = 0;
        int c_min = 10000;

        boolean flag = true;
        for (int r = 0; r < 2000; r++) {            
            for (int c = 0; c < 2000; c++) {                
                if(board[r][c] == 1) {
                    flag = false;
                    r_min = Math.min(r_min, r);
                    r_max = Math.max(r_max, r);

                    c_min = Math.min(c_min, c);
                    c_max = Math.max(c_max, c);
                }                             
            }            
        }
        int answer = (r_max-r_min+1) * (c_max-c_min+1);
        if(flag) {
            answer = 0;
        }
        System.out.println(answer);
    }
}