import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = 1;
        int n2 = Integer.parseInt(st.nextToken());        

        // st = new StringTokenizer(br.readLine());        
        System.out.printf("%d %d ", n1, n2);
        for(int i = 1; i <= 100; i++) {
            int sum = n1+n2;
            n1 = n2;
            n2 = sum;
            System.out.printf("%d ", sum);
            if(sum > 100) {
                break;
            }
        }        
    }
}