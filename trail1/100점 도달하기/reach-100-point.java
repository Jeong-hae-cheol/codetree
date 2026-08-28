import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());
        
        for(int i = A; i <= 100; i++) {
            if(i >= 90) {
                System.out.printf("%c ", 'A');
            } else if(i >= 80) {
                System.out.printf("%c ", 'B');
            } else if(i >= 70) {
                System.out.printf("%c ", 'C');
            } else if(i >= 60) {
                System.out.printf("%c ", 'D');
            } else {
                System.out.printf("%c ", 'F');
            }
        }
    }
}