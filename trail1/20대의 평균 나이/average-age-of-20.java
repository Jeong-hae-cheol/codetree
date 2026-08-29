import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());        
        
        double avg = 0;
        int cnt = 0;

        while(true) {            
            int N = Integer.parseInt(br.readLine());                                    

            if(N >= 20 && N < 30) {
                avg+=N;
                cnt++;
                continue;
            }

            break;                        
        }        

        avg = avg/cnt;
        System.out.printf("%.2f", avg);
    }
}