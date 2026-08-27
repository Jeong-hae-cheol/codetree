import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader (
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        // Please write your code here.

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a <= b && a <= c) {
            System.out.printf("1");
        } else {
            System.out.printf("0");
        }

        if(a == b && b == c) {
            System.out.printf(" 1");
        } else {
            System.out.printf(" 0");
        }
    }
}