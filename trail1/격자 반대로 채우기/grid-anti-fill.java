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
        // int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][N];

        for(int i = N; i > 0; i--) {            
            for(int j = N; j > 0; j--) {
                int num = 0;
                if(j % 2 != 0) {
                    num = N*(j-1) + i;
                } else {     
                    num = N*j - i + 1;
                }
                System.out.printf("%d ",num);
            }
            System.out.println();
        }                        
    }
}