import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());        
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());        
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            String ch = st.nextToken();
            
            System.out.println(W*H);

            if(ch.equals("C")) {
                break;
            }
                        
        }        
    }
}