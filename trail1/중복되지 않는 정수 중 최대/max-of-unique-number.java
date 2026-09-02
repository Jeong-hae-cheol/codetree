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

        // int answer = Integer.MAX_VALUE;
        // int cnt = 0;

        st = new StringTokenizer(br.readLine());
        int answer = -1;
        int[] count = new int[1001];

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            count[num]++;            
        }

        for(int i = 1000; i >= 0; i--) {
            if(count[i] == 1) {
                answer = i;
                break;
            }
        }
            
        System.out.println(answer);
    }
}