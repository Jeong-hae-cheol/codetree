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
        String str = br.readLine().replace(" ", "");

        for(int i = 1; i <= str.length(); i++) {
            System.out.print(str.charAt(i-1));

            if(i % 5 == 0) {
                System.out.println();
            }
        }
    }
}