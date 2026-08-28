import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(br.readLine());        

        int answer = 0;    

        for(int i = 0; i < A; i++) {            
            int B = Integer.parseInt(br.readLine());
            if(B % 2 != 0 && B % 3 == 0) {
                answer += B;
            }
        }
        System.out.println(answer);
    }
}