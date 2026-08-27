import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader (
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(A > n) {
                System.out.println(1);    
            } else {
                System.out.println(0);    
            }
        }
        // Please write your code here.
    }
}