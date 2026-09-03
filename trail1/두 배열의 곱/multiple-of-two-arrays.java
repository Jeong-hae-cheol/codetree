import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        br.readLine();

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("%d ", A[i][j]*B[i][j]);
            }
            System.out.println();
        }
    }
}