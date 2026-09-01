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
        
        int cnt = 0;

        for(int i = 1; i <= N; i++) {            
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                int n = Integer.parseInt(st.nextToken());
                sum += n;
            }

            if(sum/4 >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        
        System.out.printf("%d", cnt);
    }
}