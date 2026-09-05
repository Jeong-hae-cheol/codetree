import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char c = st.nextToken().charAt(0);
        
        int position = -1;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                position = i;
                break;
            }
        }
        if(position != -1) {
            System.out.println(position);
        } else {
            System.out.println("No");
        }
    }
}