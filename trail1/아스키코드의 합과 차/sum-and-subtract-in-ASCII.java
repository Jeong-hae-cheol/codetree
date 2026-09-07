import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = st.nextToken().charAt(0);
        int b = st.nextToken().charAt(0);

        System.out.println(a+b + " " + Math.abs(a-b));
    }
}