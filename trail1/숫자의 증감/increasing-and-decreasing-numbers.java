import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        int count_A = 1;
        int count_D = B;
        for(int i = 0; i < B; i++) {
            if(A.equals("A")) {
                System.out.printf("%d ", count_A++);
            } else {
                System.out.printf("%d ", count_D--);
            }
        }
    }
}