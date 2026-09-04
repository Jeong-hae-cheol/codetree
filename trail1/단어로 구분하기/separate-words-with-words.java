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

        for(String s : str) {
            System.out.println(s);
        }
        // System.out.printf("%d %d", total_length, cnt_a);
    }
}