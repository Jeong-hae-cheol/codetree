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

        // int answer = Integer.MAX_VALUE;
        // int cnt = 0;

        // st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true) {
            int n = Integer.parseInt(st.nextToken());
            if(n == 999 || n == -999) {
                break;
            }

            max = Math.max(max, n);
            min = Math.min(min, n);
        }
            
        System.out.println(max + " " + min);
    }
}