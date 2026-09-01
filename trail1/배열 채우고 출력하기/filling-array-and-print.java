import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        // int A = Integer.parseInt(st.nextToken());

        String answer = "";

        for(int i = 1; i <= 10; i++) {            
            answer = st.nextToken() + answer;    
        }
        
        System.out.println(answer);
    }
}