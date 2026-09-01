import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        // int N = Integer.parseInt(st.nextToken());            
        int sum = 0;
        int cnt = 0;

        for(int i = 1; i <= 10; i++) {            
            int n = Integer.parseInt(st.nextToken());

            if(n == 0) {
                break;
            }

            if(n % 2 == 0) {
                sum += n;
                cnt++;   
            }                
        }
        
        System.out.printf("%d %d", cnt, sum);
    }
}