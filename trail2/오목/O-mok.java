import java.util.Scanner;

public class Main {
    static int SIZE = 19;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int[] dr = {0, 1, 1, -1};
        int[] dc = {1, 0, 1, 1};
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {

                if (arr[r][c] == 0) {
                    continue;
                }

                for (int d = 0; d < 4; d++) {
                    int cnt = 1;
                    for (int i = 1; i < 5; i++) {
                        if(!isRange(r+dr[d]*i, c+dc[d]*i)) {
                            continue;
                        }

                        if(arr[r][c] == arr[r+dr[d]*i][c+dc[d]*i]) {
                            cnt++;                            
                        }
                    }
                    if (cnt == 5) {
                        System.out.println(arr[r][c]);
                        System.out.println((r+1+dr[d]*2) + " " + (c+1+dc[d]*2));
                        return ;
                    }
                }
            }
        }
        System.out.print(0);
    }

    static boolean isRange(int r, int c) {
        if(r < 0 || r >= SIZE || c < 0 || c >= SIZE) {
            return false;
        }
        return true;
    }
}
