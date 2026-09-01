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
            int M = Integer.parseInt(br.readLine());            
            int cnt = 0;

            while(M != 1) {
                if(M % 2 == 0) {
                    M /= 2;
                } else {
                    M = M*3+1;
                }
                cnt++;
            }
            
            System.out.println(cnt);
        }
    }
}