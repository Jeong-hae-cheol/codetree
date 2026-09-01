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

        String answer = "";
        for(int i = 1; i <= N; i++) {                        
            int num = Integer.parseInt(st.nextToken());
            
            if(num % 2 == 0) {
                answer = num + " " +answer;
            }
        }
        
        System.out.println(answer);
    }
}