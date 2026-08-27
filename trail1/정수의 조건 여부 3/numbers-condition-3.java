import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());
        // int c = Integer.parseInt(st.nextToken());

        if((a%13 == 0) ||  (a%19==0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}