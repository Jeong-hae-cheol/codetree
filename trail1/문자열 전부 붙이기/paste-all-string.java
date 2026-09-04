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
            System.out.print(br.readLine());            
        }                
    }
}