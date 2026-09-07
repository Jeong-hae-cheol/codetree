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
        String AB = "";
        String BA = "";

        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);

            if(c >= '0' && c <= '9') {
                AB += c;
            } else {
                break;
            }
        }

        for(int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);

            if(c >= '0' && c <= '9') {
                BA += c;
            } else {
                break;
            }
        }        

        int answer = Integer.parseInt(AB) + Integer.parseInt(BA);
        System.out.println(answer);
    }
}