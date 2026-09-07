import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        char a = st.nextToken().charAt(0);
        int b = Integer.parseInt(st.nextToken());

        System.out.printf("%d %c", (int)a, b);
    }
}