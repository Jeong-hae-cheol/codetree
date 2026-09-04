import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N+1];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i+1; j++) {
                if(j == 0 || j==i+1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }  
            }            
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i+1; j++) {                
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}