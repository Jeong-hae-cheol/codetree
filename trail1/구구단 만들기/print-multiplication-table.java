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

        for(int i = 1; i <= 9; i++) {
            for(int j = B; j >= A; j--) {
                if(j % 2 == 1) {
                    continue;
                }
                System.out.printf("%d * %d = %d", j, i, j*i);

                if(j >= A+1) {
                    System.out.printf(" / ");
                }
            }
            System.out.println();
        }
    }
}