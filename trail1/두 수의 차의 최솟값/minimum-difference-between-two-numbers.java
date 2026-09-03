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

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                if(min > arr[j] - arr[i]) {
                    min = arr[j] - arr[i];
                }
            }
        }       
    
        System.out.println(min);
    }
}