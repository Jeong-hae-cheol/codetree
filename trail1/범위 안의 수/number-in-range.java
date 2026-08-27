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

        if(a >= 10 && a <= 20) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}