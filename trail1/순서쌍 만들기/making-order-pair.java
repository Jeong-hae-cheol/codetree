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
                System.out.printf("(%d,%d) ", N-i, N-j);                
            }            
            System.out.println();
        }
    }
}