import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());
        
        char[] c = br.readLine().toCharArray();
        int len = c.length;
        
        for(int i = len-1; i >= 0; i--) {
            if(i%2 == 1) {
                System.out.print(c[i]);
            }
        }
    }
}