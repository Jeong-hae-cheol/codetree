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

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {                
                if(i == 0 || j < i || j == N-1) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }
}