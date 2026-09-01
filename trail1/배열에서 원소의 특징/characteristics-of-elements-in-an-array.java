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
        int prev = 0;

        for(int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num % 3 == 0) {
                break;
            }
            prev = num;
        }
        

        System.out.printf("%d", prev);
    }
}