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
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(max < num) {
                max2 = max;
                max = num;
            } else if(max2 < num) {
                max2 = num;
            }
        }

        
            
        System.out.println(max + " " + max2);
    }
}