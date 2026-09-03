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

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());            
        }

        int max = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                if(max < arr[j] - arr[i]) {
                    max = arr[j] - arr[i];
                }
            }
        }       
    
        System.out.println(max);
    }
}