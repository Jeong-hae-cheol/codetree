import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = br.readLine();
        int answer = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c >= '0' && c <= '9') {
                answer += c - '0';
            } 
        }
        System.out.println(answer);
    }
}