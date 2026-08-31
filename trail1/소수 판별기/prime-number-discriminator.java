import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());
        // int c = Integer.parseInt(st.nextToken());

        String answer = "P";
        
        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                answer = "C";
                break;
            }
        }
        

        System.out.println(answer);
    }
}