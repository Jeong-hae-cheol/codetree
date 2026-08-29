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
        
        int sum = 0;  
        double mean = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n >= 0 && n <= 200) {
                sum += n;
                count++;
            }
        }
        
        mean = Math.round(sum*10.0 / count)/10.0;

        System.out.println(sum + " " + mean);
    }
}