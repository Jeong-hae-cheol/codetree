import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());
        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;

        String c = br.readLine();

        for(String s : str) {
            if(s.charAt(2) == c.charAt(0) || s.charAt(3) == c.charAt(0)) {
                System.out.println(s);
                cnt++;
            }
        }        

        System.out.println(cnt);
    }
}