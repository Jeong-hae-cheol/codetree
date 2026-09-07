import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
                
        String str = st.nextToken();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                sb.append(c);
            } else if(c >= 'a' && c <= 'z') {
                sb.append(c);
            }
        }        
        System.out.println(sb.toString().toUpperCase());
    }
}