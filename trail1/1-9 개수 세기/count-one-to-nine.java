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

        int[] cnt = new int[10];
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            cnt[num]++;
        }

        for(int i = 1; i <= 9; i++) {            
            System.out.println(cnt[i]);
        }        
    }
}