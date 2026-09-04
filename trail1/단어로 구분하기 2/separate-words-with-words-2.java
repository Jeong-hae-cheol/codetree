import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        String[] str = br.readLine().split(" ");

        for(int i = 0; i < str.length; i++) {
            if(i % 2 == 0)
                System.out.println(str[i]);
        }
        // System.out.printf("%d %d", total_length, cnt_a);
    }
}