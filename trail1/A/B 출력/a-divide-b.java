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
        
        System.out.printf("%d.", A/B);

        int n = A%B *10;
        for(int i = 0; i < 20; i++) {
            System.out.printf("%d", n/B);
            n = n%B *10;
        }
    }
}