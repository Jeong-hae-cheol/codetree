import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        boolean [][] visited = new boolean[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int ans = 0;

        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < n-2; c1++) {
                for (int i = 0; i < 3; i++) {
                    visited[r1][c1+i] = true;
                }
                for (int r2 = r1; r2 < n; r2++) {
                    for (int c2 = 0; c2 < n-2; c2++) {
                        boolean flag = false;
                        for (int i = 0; i < 3; i++) {
                            if(visited[r2][c2+i]) {
                                flag = true;
                            }
                        }

                        if(flag) {
                            continue;
                        }
                        // System.out.println(r1 + " " + c1 + " / " + r2 + " " + c2);
                        int sum = 0;
                        for(int i = 0; i < 3; i++) {
                            sum += arr[r1][c1+i];
                            sum += arr[r2][c2+i];
                        }
                        ans = Math.max(ans, sum);
                    }
                }
                for (int i = 0; i < 3; i++) {
                    visited[r1][c1+i] = false;
                }
            }
        }

        System.out.print(ans);
    }
}