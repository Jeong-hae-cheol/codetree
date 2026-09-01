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
        
        int cnt = 0;

        for(int i = A; i <= B; i++) {
            int cnt_div = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt_div++;
                }

                if(cnt_div > 3) {
                    break;
                }
            }
            
            if(cnt_div == 3) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}