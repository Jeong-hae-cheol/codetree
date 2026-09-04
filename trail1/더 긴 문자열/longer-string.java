import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        String str2 = st.nextToken();

        int len = str.length();
        int len2 = str2.length();

        if(len == len2) {
            System.out.printf("same");
        } else {
            if(len > len2) {
                System.out.printf("%s %d", str, len);
            } else {
                System.out.printf("%s %d", str2, len2);
            }
        }
    }
}