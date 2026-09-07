import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < Q; i++) {            
            int n = Integer.parseInt(br.readLine());

            switch(n) {
                case 1: {
                    char first = sb.charAt(0);
                    sb.deleteCharAt(0);
                    sb.append(first);
                }
                break;
                case 2: {
                    char last = sb.charAt(sb.length()-1);
                    sb.deleteCharAt(sb.length()-1);
                    sb.insert(0, last);                    
                }
                break;
                case 3: {
                    sb.reverse();
                }
                break;
            }
            System.out.println(sb);
        }

    }
}