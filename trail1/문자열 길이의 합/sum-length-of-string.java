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
        
        int total_length = 0;
        int cnt_a = 0;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            total_length += str.length();

            if(str.charAt(0) == 'a') {
                cnt_a++;
            }
        }

        System.out.printf("%d %d", total_length, cnt_a);
    }
}