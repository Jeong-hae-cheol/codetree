import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int start = Math.min(A, B);
        int end = Math.max(A,B);
        int sum = 0;        

        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                sum += i;                
            }
        }
        

        System.out.println(sum);
    }
}