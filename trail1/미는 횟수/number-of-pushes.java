import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String A = br.readLine();
        String B = br.readLine();
        int N = 0;

        while(N <= A.length()) {
            char c = A.charAt(A.length()-1);
            A = c + A.substring(0, A.length()-1);

            N++;
            if(A.equals(B)) {
                break;
            }        
        }

        if(N > A.length()) {
            N = -1;
        }
        System.out.println(N);
    }
}