import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());        
        int answer = 0;

        while(n != 1) {
            n /= 2;
            answer++;
        }
        System.out.println(answer);
    }
}