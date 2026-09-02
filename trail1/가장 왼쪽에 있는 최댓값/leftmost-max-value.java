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

        
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());            
        }
        
        // int idx = N;
        
        while(N > 0) {            
            int max = 0;
            int idx = 0;
            for(int i = 0; i < N; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                    idx = i;
                }
            }
            N = idx;
            System.out.printf("%d ", idx+1);
        }
            
        // System.out.println(answer);
    }
}