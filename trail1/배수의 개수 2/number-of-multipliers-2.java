import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num%2 != 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}