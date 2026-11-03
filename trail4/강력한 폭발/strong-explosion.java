import java.util.*;

class Point {
    int r, c;

    Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class Main {
    static int n, ans, cr, cc;
    static int[][] grid;
    static int[][] visited;    
    static ArrayList<Point> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if(grid[i][j] == 1) {
                    list.add(new Point(i,j));
                }
            }
        }
        // Please write your code here.        
        solve(0);

        System.out.println(ans);
    }

    public static void solve(int cnt) {
        if(cnt >= list.size()) {
            ans = Math.max(ans, cal());
            return;
        }

        for(int i = 0; i < 3; i++) {            
            boom(i, 1, cnt);
            solve(cnt+1);
            boom(i, -1, cnt);
        }
    }

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }

    public static int cal() {
        int sum = 0;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j] > 0) {
                    sum++;
                }
            }
        }

        return sum;
    }

    public static void boom(int type, int dir, int cnt) {
        int[] dr = new int[4];
        int[] dc = new int[4];
        int r = list.get(cnt).r;
        int c = list.get(cnt).c;

        if(type == 0) {
            dr = new int[]{1, 2, -1, -2};
            dc = new int[]{0, 0, 0, 0};
        } else if( type == 1) {
            dr = new int[]{1, 0, -1, 0};
            dc = new int[]{0, 1, 0, -1};
        } else {
            dr = new int[]{1, 1, -1, -1};
            dc = new int[]{1, -1, 1, -1};
        }

        visited[r][c] += dir;        

        for(int i = 0; i < 4; i++) {
            int nr = r+dr[i];
            int nc = c+dc[i];
            
            if(inRange(nr, nc)) {
                visited[nr][nc] += dir;
            }
        }
    }    
}