import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        // int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
                        
        for(int i = 2; i <= B; i++) {
            if(i == 2) {
                System.out.printf("%d ", i);
                continue;
            }
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    break;
                }

                if(j == i-1) {
                    System.out.printf("%d ", i);
                }
            }                        
        }        
    }
}