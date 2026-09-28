import java.util.Scanner;
public class Main {
    static int n;
    static int m;
    static int[] dr = new int[]{-1, 1, 0, 0, 1, 1, -1, -1};
    static int[] dc = new int[]{0, 0, 1, -1, -1, 1, -1, 1};
    static char[][] board;
    static boolean[][] visited;
    static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        board = new char[n][m];
        visited = new boolean[n][m];
        ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = arr[i].charAt(j);
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if(board[r][c] == 'L') {                    
                    solve(r,c);
                }                
            }
        }

        System.out.print(ans);
    }

    public static void solve(int r, int c) {
        for (int i = 0; i < 8; i++) {
            int rd = r+dr[i];
            int cd = c+dc[i];                        
            if(inRange(rd, cd) && board[rd][cd] == 'E') {                
                if(inRange(rd+dr[i], cd+dc[i]) && board[rd+dr[i]][cd+dc[i]] == 'E') {                    
                    ans++;
                }   
            }
        }

        
    }
    public static boolean inRange(int r, int c) {
        if(r < 0 || r >= n || c < 0 || c >= m) {
            return false;
        }
        return true;
    }
}