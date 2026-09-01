import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for(int i = 2; i <= 8; i+=2) {
            for(int j = B; j >= A; j--) {                
                System.out.printf("%d * %d = %d", j, i, j*i);

                if(j >= A+1) {
                    System.out.printf(" / ");
                }
            }
            System.out.println();
        }
    }
}