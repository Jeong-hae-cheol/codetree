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

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer = 0;
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            if(arr[i] == 2) {
                cnt++;
            }
            
            if(cnt > 2) {
                answer = i+1;
                break;
            }
        }
        System.out.println(answer);
    }
}