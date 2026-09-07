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

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case 'L': {
                    char first = sb.charAt(0);
                    sb.deleteCharAt(0);
                    sb.append(first);
                }
                break;
                case 'R': {
                    char last = sb.charAt(sb.length()-1);
                    sb.deleteCharAt(sb.length()-1);
                    sb.insert(0, last);                    
                }
                break;                                    
            }            
        }
        System.out.println(sb);

    }
}