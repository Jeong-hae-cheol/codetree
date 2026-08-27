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

        if(a >= 3 && a <= 5) {
            System.out.println("Spring");
        } else if (a >= 6 && a <= 8) {
            System.out.println("Summer");
        } else if (a >= 9 && a <= 11) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }
}