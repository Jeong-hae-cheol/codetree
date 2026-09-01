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
            if(str.equals("0")) {
                break;
            }
            answer = str +" "+answer;
        }
        
        System.out.printf(answer);
    }
}