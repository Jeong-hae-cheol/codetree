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
            if(N > 4) {
                System.out.println("Vacancy");
                break;
            }
            switch(N) {
                case 1:
                    System.out.println("John");
                break;
                case 2:
                    System.out.println("Tom");
                break;
                case 3:
                    System.out.println("Paul");
                break;
                case 4:
                    System.out.println("Sam");
                break;
            }
        }

        // System.out.println(answer);
    }
}