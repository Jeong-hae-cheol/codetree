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

        // st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i = 1; i <= 10; i++) {
            // int num = Integer.parseInt(st.nextToken());
            if(N*i % 5 == 0) {
                cnt++;
            }
            
            System.out.printf("%d ", N*i);

            if(cnt >= 2) {
                break;
            }
        }        
    }
}