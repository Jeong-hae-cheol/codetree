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

        int n1 = 0;
        int n2 = N;

        for(int i = 0; i < N*2; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j <= n1; j++) {
                    System.out.printf("* ");
                }
                n1++;
            } else {
                for(int j = n2; j > 0; j--) {
                    System.out.printf("* ");
                }
                n2--;
            }
            System.out.println();
        }
    }
}