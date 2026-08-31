import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());        
        int b = Integer.parseInt(st.nextToken());        
        // int c = Integer.parseInt(st.nextToken());                

        int answer = 0;
        
        for(int i = a; i <= b; i++) {
            if(1920 % i == 0 && 2880 % i == 0) {
                answer = 1;
                break;
            }
        }
        

        System.out.println(answer);
    }
}