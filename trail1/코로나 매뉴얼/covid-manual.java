import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int sick = Integer.parseInt(st.nextToken());
        // int temp = Integer.parseInt(st.nextToken());        
        int count = 0;

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String sick = st.nextToken();
            int temp = Integer.parseInt(st.nextToken());

            if(sick.equals("Y") && temp >= 37) {
                count++;
            }
        }
        
        String answer = "N";
        
        if(count >= 2) {
            answer = "E";
        }

       

        System.out.println(answer);
    }
}