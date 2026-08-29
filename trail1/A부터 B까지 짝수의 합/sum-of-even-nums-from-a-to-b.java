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
        
        int sum = 0;        

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;                
            }
        }
        

        System.out.println(sum);
    }
}