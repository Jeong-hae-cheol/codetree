import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;    

        for(int i = 1; i <= 5; i++) {            
            int N = Integer.parseInt(br.readLine());
            if(N % 2 == 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}