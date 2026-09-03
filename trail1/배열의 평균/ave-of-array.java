import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int N = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[2][4];

        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());            
            for(int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 2; i++) {
            int sum = 0;            
            for(int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            System.out.printf("%.1f ", sum/4.0);
        }

        System.out.println();

        for(int i = 0; i < 4; i++) {
            int sum = 0;            
            for(int j = 0; j < 2; j++) {
                sum += arr[j][i];
            }
            System.out.printf("%.1f ", sum/2.0);
        }

        System.out.println();
        
        int sum = 0;
        for(int i = 0; i < 2; i++) {            
            for(int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }            
        }
        System.out.printf("%.1f ", sum/8.0);
    }
}