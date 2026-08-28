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
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num%3 == 0 && num%2 != 0) {
                System.out.println(num);
            }
        }
    }
}