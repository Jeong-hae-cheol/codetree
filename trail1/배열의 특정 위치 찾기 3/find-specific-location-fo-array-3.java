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
        int[] arr = new int[100];
        for(int i = 1; i <= 100; i++) {                        
            int num = Integer.parseInt(st.nextToken());
            
            if(num == 0) {
                System.out.println(arr[i-4]+arr[i-3]+arr[i-2]);
                break;
            }

            arr[i-1] = num;            
        }
        
        // System.out.printf("%d %.1f", sum, avg/cnt);
    }
}