import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        int cnt = 1;       

        for(int i = 0; i < M; i++) {
            int r = 0;
            int c = i;

            while(c >= 0 && r < N) {
                A[r][c] = cnt++;
                r++;
                c--;
            }
        }

        for(int i = 1; i < N; i++) {
            int r = i;
            int c = M-1;

            while(c >= 0 && r < N) {
                A[r][c] = cnt++;

                r++;
                c--;
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.printf("%d ", A[i][j]);
            }
            System.out.println();
        }
    }
}