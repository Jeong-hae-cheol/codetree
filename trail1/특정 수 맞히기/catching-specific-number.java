import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int A = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());
        // int N = Integer.parseInt(br.readLine());

        while(true) {
            int N = Integer.parseInt(br.readLine());            
            if(N == 25) {
                System.out.println("Good");
                break;
            }

            if(N > 25) {
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            }
            
        }

        // System.out.println(answer);
    }
}