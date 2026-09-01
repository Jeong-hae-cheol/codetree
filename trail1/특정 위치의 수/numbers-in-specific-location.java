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

        int sum = 0;
        for(int i = 1; i <= 10; i++) {                        
            int num = Integer.parseInt(st.nextToken());
            if(i == 3 || i == 5 || i == 10) {
                sum += num;
            }            
        }
        
        System.out.println(sum);
    }
}