import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());                
        
        int T = Integer.parseInt(br.readLine());
        String answer = "0";

        for(int i = 0; i < T; i++) {            
            int n = Integer.parseInt(br.readLine());
            int sum = Integer.parseInt(answer) + n;
            answer = String.valueOf(sum);
        }
        
        char first = answer.charAt(0);
        answer = answer.substring(1, answer.length()) + first;

        System.out.println(answer);
    }
}