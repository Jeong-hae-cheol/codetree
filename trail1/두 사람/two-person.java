import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        
        int age_1 = Integer.parseInt(st.nextToken());
        String sex_1 = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int age_2 = Integer.parseInt(st.nextToken());
        String sex_2 = st.nextToken();

        int answer = 0;

        if(age_1 >= 19 && sex_1.equals("M")) {
            answer = 1;
        }

        if(age_2 >= 19 && sex_2.equals("M")) {
            answer = 1;
        }
        System.out.println(answer);
    }
}