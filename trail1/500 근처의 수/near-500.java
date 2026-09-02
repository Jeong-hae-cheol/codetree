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

        // int answer = Integer.MAX_VALUE;
        // int cnt = 0;

        
        // int[] arr = new int[N];

        // st = new StringTokenizer(br.readLine());

        int max = 0;
        int min = 1001;
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n < 500) {
                max = Math.max(max, n);
            } else {
                min = Math.min(min, n);
            }

        }
                
            
        System.out.println(max + " " + min);
    }
}