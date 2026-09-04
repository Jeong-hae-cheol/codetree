import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j] + arr[i][j-1];
                }  
            }            
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {                
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}