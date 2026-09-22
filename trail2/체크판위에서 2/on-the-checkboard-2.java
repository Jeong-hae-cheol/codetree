import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        int cnt = 0;
        for (int i = 1; i < R-1; i++) {
            for (int j = 1; j < C-1; j++) {
                for (int k = i+1; k < R-1; k++) {
                    for (int t = j+1; t < C-1; t++) {
                        if(
                            grid[0][0] != grid[i][j] &&
                            grid[i][j] != grid[k][t] &&
                            grid[k][t] != grid[R-1][C-1]
                        ) cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}