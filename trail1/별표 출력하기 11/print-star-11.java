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

        for(int i = 0; i < 2*N+1; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < 2*N+1; j++) {
                    System.out.printf("* ");
                }                
            } else {
                for(int j = 0; j < 2*N+1; j++) {
                    if(j % 2 == 0) {
                        System.out.printf("* ");
                    } else {
                        System.out.printf("  ");
                    }
                }                
            }
            System.out.println();
        }
    }
}