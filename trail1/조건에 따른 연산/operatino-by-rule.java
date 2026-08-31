import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());        
        int answer = 0;

        while(n < 1000) {
            if(n % 2 == 0) {
                n = 3*n+1;
            } else {
                n = 2*n + 2;
            }
            answer++;
        }
        System.out.println(answer);
    }
}