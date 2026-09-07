import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String A = st.nextToken();
        String B = st.nextToken();

        String AB = A+B;
        String BA = B+A;

        int answer = Integer.parseInt(AB) + Integer.parseInt(BA);
        System.out.println(answer);
    }
}