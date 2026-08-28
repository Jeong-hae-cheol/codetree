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
        int answer3 = 0;
        int answer5 = 0;
        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num % 3 == 0) {
                answer3++;
            }
            if(num%5 == 0) {
                answer5++;
            }
        }
        System.out.println(answer3 + " " + answer5);
    }
}