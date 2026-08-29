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
        double avg = 0;

        for (int i = 1; i <= n; i++) {          
            int num = Integer.parseInt(br.readLine());  
            sum += num;
        }
                
        avg = Math.round(sum * 10.0/ n) / 10.0; 
        System.out.println(sum + " " + avg);
    }
}