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

        if(10 > a || a > 20) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}