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
        // int B = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i <= A; i++) {
            if(i % 3 == 0) {
                System.out.printf("%d ", 0);
            } else if(i%10 != 0 && i%10%3 == 0) {
                System.out.printf("%d ", 0);
            } else if(i/10 != 0 && i/10%3 == 0) {
                System.out.printf("%d ", 0);
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}