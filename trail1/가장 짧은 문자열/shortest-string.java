import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        String str = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int len = str.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int max = Math.max(len, len2);
        max = Math.max(max, len3);

        int min = Math.min(len, len2);
        min = Math.min(min, len3);

        System.out.printf("%d", max-min);
    }
}