import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder(br.readLine());
        int n = Integer.parseInt(br.readLine());

        n = Math.min(n, sb.length());
        
        System.out.println(sb.reverse().substring(0, n));
    }
}