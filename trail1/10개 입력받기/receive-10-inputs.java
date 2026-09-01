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

            if(n != 0) {
                sum += n;
                cnt++;   
            } else {
                break;
            }      
        }
        
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}