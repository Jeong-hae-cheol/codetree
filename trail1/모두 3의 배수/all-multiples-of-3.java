import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());        

        String answer = "1";
        for(int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n % 3 != 0) {
                answer = "0";
                break;
            }
        }
                
        System.out.println(answer);
    }
}