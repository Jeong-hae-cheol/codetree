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

        int answer = Integer.MAX_VALUE;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if(answer > num) {
                cnt = 1;
                answer = num;
            } else if(answer == num) {
                cnt++;
            }
        }
            
        System.out.println(answer + " " + cnt);
    }
}