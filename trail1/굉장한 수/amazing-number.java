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
        

        if((a % 2 != 0 && a % 3 == 0)||(a % 2 == 0 && a % 5 == 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}