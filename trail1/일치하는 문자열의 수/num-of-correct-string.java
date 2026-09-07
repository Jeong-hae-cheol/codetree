import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());                
        
        int T = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        int answer = 0;

        for(int i = 0; i < T; i++) {            
            String cmp = br.readLine();
            if(s.equals(cmp)) {
                answer++;
            }
        }
                
        
        System.out.println(answer);
    }
}