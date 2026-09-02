import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());
        
        int[] A = new int[N1];
        int[] B = new int[N2];

        String answer = "No";

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N1; i++) {
            A[i] = Integer.parseInt(st.nextToken());    
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N2; i++) {
            B[i] = Integer.parseInt(st.nextToken());    
        }        

        for(int i = 0; i <= N1-N2; i++) {
            for(int j = 0; j < N2; j++) {
                if(A[i+j] != B[j]) {
                    break;
                }

                if(j == N2-1) {
                    answer = "Yes";
                }
            }
            if(answer.equals("Yes")) {
                break;
            }
        }
        System.out.println(answer);
    }
}