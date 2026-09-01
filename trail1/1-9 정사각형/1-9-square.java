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

        int cnt = 1;

        for(int i = 1; i <= N; i++) {            
            for(int j = 1; j <= N; j++) {
                System.out.printf("%d", cnt);
                cnt = (cnt+1)%10;
                if(cnt == 0) {
                    cnt++;
                }
            }            
            System.out.println();
        }
    }
}