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
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int answer = 0;

        for(int i = 1; i <= 100; i++) {
            if(sum >= N)                
                break;
            sum += i;
            answer = i;
        }

        System.out.println(answer);
    }
}