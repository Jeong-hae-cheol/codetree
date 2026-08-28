import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 1; i <= N; i++) {            
            if(i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) {

            } else {
                answer++;
            }
        }
        System.out.println(answer);
    }
}