import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // st = new StringTokenizer(br.readLine());

        int[] cnt = new int[B];

        while(true) {            
            if(A > 1) {
                cnt[A%B]++;
                A /= B;                
            } else {
                break;
            }              
        }

        int sum = 0;

        for(int i = 0; i < B; i++) {
            sum += cnt[i]*cnt[i];
        }

        System.out.printf("%d", sum);
    }
}