import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        double sum = 0;

        for(int i = 1; i <= N; i++) {            
            sum += Double.parseDouble(st.nextToken());    
        }
        
        System.out.printf("%.1f\n", sum/N);

        if(sum/N >= 4.0) {
            System.out.printf("Perfect");
        } else if(sum/N >= 3.0) {
            System.out.printf("Good");
        } else {
            System.out.printf("Poor");
        }

    }
}