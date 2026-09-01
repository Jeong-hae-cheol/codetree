import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());

        int cnt = (int)'A';
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                System.out.printf("%c", (char)(cnt++));
            }
            System.out.println();
        }
    }
}