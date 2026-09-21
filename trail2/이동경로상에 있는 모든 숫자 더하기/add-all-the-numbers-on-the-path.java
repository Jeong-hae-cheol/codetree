import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int[] dr = new int[]{-1, 0, 1, 0};
        int[] dc = new int[]{0, -1, 0, 1};
        int r = n/2;
        int c = n/2;
        int dir = 0;
        int sum = 0;

        sum += board[r][c];
        for (int i = 0; i < t; i++) {
            char ch = commands.charAt(i);

            if(ch == 'L') {
                dir = (dir+1)%4;
            } else if(ch == 'R') {
                dir = (dir-1+4)%4;
            } else {
                if(isRange(r+dr[dir], c+dc[dir])) {                    
                    r += dr[dir];
                    c += dc[dir];

                    sum += board[r][c];                    
                }
            }
        }

        System.out.print(sum);

    }

    public static boolean isRange(int r, int c) {
        if(r < 0 || r >= n || c < 0 || c >= n) {
            return false;
        }
        return true;
    }
}