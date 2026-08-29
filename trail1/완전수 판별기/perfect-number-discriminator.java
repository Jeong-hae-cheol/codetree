import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int A = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());
        
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        char answer = 'N';

        for (int i = 1; i < n; i++) {            
            if(n % i == 0) {
                sum += i;
            }
        }
        
        if(sum == n) {
            answer = 'P';
        }

        System.out.println(answer);
    }
}