import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        // Please write your code here.

        int startDir = 0;

        if (startNum <= n) {
            startDir = 0;
        } else if (startNum <= 2 * n) {
            startDir = 1;
        } else if (startNum <= 3 * n) {
            startDir = 2;
        } else {
            startDir = 3;
        }

        // D L U R

        int[] dr = new int[] {1, 0, -1, 0};
        int[] dc = new int[] {0, -1, 0, 1};

        int startR = 0;
        int startC = 0;
        int dir = 3;

        for (int i = 2; i <= startNum; i++) {
            int nr = startR + dr[dir];
            int nc = startC + dc[dir];
            if (inRange(nr, nc)) {
                startR = nr;
                startC = nc;
            } else {
                dir = (dir + 1) % 4;
            }
        }
        
        int r = startR;
        int c = startC;
        int ans = 0;
        dir = startDir;
        // D L U R
        while (inRange(r, c)) {
            ans++;
            switch (grid[r][c]) {
                case '/':
                    if (dir % 2 == 0) // U or D
                        dir = (dir + 1) % 4;
                    else // L or R
                        dir = (dir - 1 + 4) % 4;
                    break;
                case '\\':
                    if (dir % 2 == 0) // U or D
                        dir = (dir - 1 + 4) % 4;
                    else // L or R
                        dir = (dir + 1) % 4;
                    break;                    
            }

            r = r + dr[dir];
            c = c + dc[dir];
        }
        System.out.print(ans);
    }

    public static boolean inRange(int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= n) {
            return false;
        }
        return true;
    }
}
