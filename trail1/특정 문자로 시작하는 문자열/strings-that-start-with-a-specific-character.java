import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        

        for(int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }    

        char c = br.readLine().charAt(0);
        
        int cnt = 0;
        int len_sum = 0;

        for(int i = 0; i < N; i++) {
            int len = str[i].length();
            if(str[i].charAt(0) == c) {                
                cnt++;
                len_sum += len;
            }
        }

        System.out.printf("%d %.2f", cnt, (double)len_sum/cnt);
    }
}