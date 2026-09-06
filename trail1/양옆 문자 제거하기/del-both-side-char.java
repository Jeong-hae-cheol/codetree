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

        String answer = S.substring(0,1) + S.substring(2, S.length()-2) + S.substring(S.length()-1 , S.length());

        System.out.println(answer);
    }
}