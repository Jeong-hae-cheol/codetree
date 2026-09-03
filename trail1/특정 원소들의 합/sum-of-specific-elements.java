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
        
        int[][] arr = new int[4][4];

        for(int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());            
            for(int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;
        for(int i = 0; i < 4; i++) {            
            for(int j = 0; j < i+1; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}