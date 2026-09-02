import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());                

        int cnt = 0;
        for(int i = 0; i < A; i++) {
            int n = Integer.parseInt(st.nextToken());

            if(n == B) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}