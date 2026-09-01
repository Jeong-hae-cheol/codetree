import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        // int N = Integer.parseInt(st.nextToken());                                
        String answer = "";

        for(int i = 1; i <= 10; i++) {
            String str = st.nextToken();

            if(i == 2 || i == 5 || i == 8) {
                answer += str + " ";
            }
        }
        
        System.out.printf(answer);
    }
}