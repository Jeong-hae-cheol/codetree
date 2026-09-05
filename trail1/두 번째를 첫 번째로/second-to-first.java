import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        
        char[] arr = S.toCharArray();
        char x = arr[0];
        char y = arr[1];

        for(int i = 0; i < S.length(); i++) {
            if(arr[i] == y) {
                arr[i] = x;
            }
        }

        System.out.println(String.valueOf(arr));
    }
}