import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int answer = 1;

            for(int j = A; j <= B; j++) {
                answer *= j;
            }
            System.out.println(answer);
        }
    }
}