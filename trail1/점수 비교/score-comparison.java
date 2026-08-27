import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader (
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        // Please write your code here.

        int math_A = Integer.parseInt(st.nextToken());
        int eng_A = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());

        int math_B = Integer.parseInt(st.nextToken());
        int eng_B = Integer.parseInt(st.nextToken());

        if((math_A > math_B) && (eng_A > eng_B)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}