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
        int sum_even = 0;
        int sum_odd = 0;

        for(int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(i % 2 == 1) {
                sum_odd += num;
            } else {
                sum_even += num;
            }
        }
        

        System.out.printf("%d", Math.abs(sum_odd-sum_even));
    }
}