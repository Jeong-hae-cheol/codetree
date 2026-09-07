import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());                
        String[] str = br.readLine().split("");
        int answer = 0;

        for(int i = 0; i < str.length; i++) {            
            answer += Integer.parseInt(str[i]);
        }
        
        System.out.println(answer);
    }
}