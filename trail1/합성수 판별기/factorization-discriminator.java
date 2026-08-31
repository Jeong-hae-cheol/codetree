import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());        
        // int b = Integer.parseInt(st.nextToken());        
        // int c = Integer.parseInt(st.nextToken());                

        String answer = "N";
        
        for(int i = 2; i < N; i++) {
            if(N % i == 0) {
                answer = "C";
            }
        }
        

        System.out.println(answer);
    }
}